/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.util;

import static com.decawave.argomanager.ArgoApp.uiHandler;

import com.annimon.stream.function.Supplier;
import com.decawave.argo.api.interaction.Fail;
import com.decawave.argo.api.interaction.NetworkNodeConnection;
import com.decawave.argo.api.struct.ConnectPriority;
import com.decawave.argo.api.struct.NetworkNode;
import com.decawave.argomanager.argoapi.ble.BleConnectionApi;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//import rx.functions.Action1;
//import rx.functions.Action2;

/**
 * Argo project.
 */

public class ConnectionUtil {

    private static final int RETRY_INTERVAL = 1000;

    public static void connectAndUpdate(BleConnectionApi bleConnectionApi,
                                        String bleAddress, int attemptCount,
                                        Supplier<NetworkNode> updateNodeSupplier,
                                        Consumer<NetworkNodeConnection> connectionListener,
                                        BiConsumer<NetworkNodeConnection.WriteEffect,NetworkNode> onSuccess,
                                        Consumer<Fail> onFail, Consumer<Integer> onFinished) {
        // just set up the initial counter value
        _connectAndUpdate(bleConnectionApi, bleAddress, 1, attemptCount, new NetworkNode[] { null }, updateNodeSupplier, connectionListener, onSuccess, onFail, onFinished);
    }

    private static void _connectAndUpdate(BleConnectionApi bleConnectionApi,
                                          String bleAddress,
                                          int counter,
                                          int attemptCount,
                                          NetworkNode[] node,
                                          Supplier<NetworkNode> updateNodeSupplier,
                                          Consumer<NetworkNodeConnection> connectionListener,
                                          BiConsumer<NetworkNodeConnection.WriteEffect, NetworkNode> onSuccess,
                                          Consumer<Fail> onFail, Consumer<Integer> onFinished) {
        boolean[] failure = { false };
        NetworkNodeConnection aConnection = bleConnectionApi.connect(bleAddress, ConnectPriority.HIGH, (Consumer<NetworkNodeConnection>) connection -> {
            // on connected
            if (node[0] == null) {
                node[0] = updateNodeSupplier.get();
            }
            connection.updateOtherSideEntity(node[0], false, writeEffect -> {
                // on success
                onSuccess.accept(writeEffect, node[0]);
                // disconnect
                connection.disconnect();
            }, fail -> {
                // on fail
                handleFail(fail, counter, attemptCount, onFail, failure);
                // we will get disconnected automatically
            });
        }, (networkNodeConnection, fail) -> {
            // on fail
            handleFail(fail, counter, attemptCount, onFail, failure);
            // we will get disconnected automatically
        }, (networkNodeConnection,errCode) -> {
            // on disconnected
            if (failure[0] && counter < attemptCount) {
                // try again
                uiHandler.postDelayed(() -> _connectAndUpdate(bleConnectionApi, bleAddress, counter + 1, attemptCount,
                        node, updateNodeSupplier, connectionListener, onSuccess, onFail, onFinished), RETRY_INTERVAL);
            } else {
                onFinished.accept(errCode);
            }
        });
        // let the connection listener know (each time a new connection attempt is made)
        connectionListener.accept(aConnection);
    }

    private static void handleFail(Fail fail, int counter, int attemptCount, Consumer<Fail> onFail, boolean[] failure) {
        if (counter == attemptCount) {
            onFail.accept(fail);
        } else {
            failure[0] = true;
        }
    }

}
