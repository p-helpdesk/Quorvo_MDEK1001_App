/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.argoapi.ble.connection;

import com.decawave.argo.api.ConnectionState;
import com.decawave.argo.api.interaction.Fail;
import com.decawave.argo.api.interaction.NetworkNodeConnection;
import com.decawave.argomanager.argoapi.ble.GattInteractionCallback;
import com.decawave.argomanager.argoapi.ble.SynchronousBleGatt;
import com.decawave.argomanager.ble.BleGattCharacteristic;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

//import rx.functions.Action2;
//import rx.functions.Action4;

/**
 * This is a special callback capable of doing init operations,
 * before letting know the onConnectedCallback and onFailCallback
 * about established {@link NetworkNodeConnection}.
 *
 * @see AsynchronousGattOperation
 *
 */
class GattInteractionToConnectionWrapperCallback implements GattInteractionCallback {
    @Nullable
    private final BiConsumer<NetworkNodeConnection,Fail> onFailCallback;

    // once we receive callback about successfully established link (onSetupDone), we store the connection here
    private final NetworkNodeConnectionWrapper connectionWrapper;

    GattInteractionToConnectionWrapperCallback(@NotNull NetworkNodeConnectionWrapper connectionWrapper,
                                               @Nullable BiConsumer<NetworkNodeConnection,Fail> onFailCallback) {
        this.connectionWrapper = connectionWrapper;
        this.onFailCallback = onFailCallback;
    }

    @Override
    public boolean stillInterested() {
        GattInteractionCallback callback = connectionWrapper.asGattCallback();
        if (callback != null) {
            return callback.stillInterested();
        } else {
            ConnectionState state = connectionWrapper.getState();
            switch (state) {
                case PENDING:
                case CONNECTING:
                case CONNECTED:
                    return true;
                case DISCONNECTING:
                case CLOSED:
                default:
                    return false;
            }
        }
    }

    @Override
    public void onCharacteristicReadComplete(SynchronousBleGatt gatt) {
        delegateSuccessToConnection(gatt, GattInteractionCallback::onCharacteristicReadComplete);
    }

    @Override
    public void onDescriptorReadComplete(SynchronousBleGatt gatt) {
        delegateSuccessToConnection(gatt, GattInteractionCallback::onDescriptorReadComplete);
    }

    @Override
    public void onDescriptorWriteComplete(SynchronousBleGatt gatt) {
        delegateSuccessToConnection(gatt, GattInteractionCallback::onDescriptorWriteComplete);
    }

    @Override
    public void onCharacteristicWriteComplete(SynchronousBleGatt gatt) {
        delegateSuccessToConnection(gatt, GattInteractionCallback::onCharacteristicWriteComplete);
    }

    @Override
    public void onMtuChangeComplete(SynchronousBleGatt gatt) {
        delegateSuccessToConnection(gatt, GattInteractionCallback::onMtuChangeComplete);
    }

    //@Override
    public void onCharacteristicReadFailed(SynchronousBleGatt gatt, int errorCode, String failMessage) {
        delegateFailToConnection(gatt, errorCode, failMessage, GattInteractionCallback::onCharacteristicReadFailed);
    }

    //@Override
    public void onFail(SynchronousBleGatt gatt, int errorCode, String failMessage) {
        if (onFailCallback != null) {
            // notify directly callback (do not go through connection)
            onFailCallback.accept(connectionWrapper, new Fail(errorCode, failMessage));
        }
    }

    //@Override
    public void onCharacteristicWriteFailed(SynchronousBleGatt gatt, int errorCode, String failMessage) {
        delegateFailToConnection(gatt, errorCode, failMessage, GattInteractionCallback::onCharacteristicWriteFailed);
    }

    //@Override
    public void onDescriptorReadFailed(SynchronousBleGatt gatt, int errorCode, String failMessage) {
        delegateFailToConnection(gatt, errorCode, failMessage, GattInteractionCallback::onDescriptorReadFailed);
    }

    //@Override
    public void onDescriptorWriteFailed(SynchronousBleGatt gatt, int errorCode, String failMessage) {
        delegateFailToConnection(gatt, errorCode, failMessage, GattInteractionCallback::onDescriptorWriteFailed);
    }

    //@Override
    public void onMtuChangeFailed(SynchronousBleGatt gatt, int errorCode, String failMessage) {
        delegateFailToConnection(gatt, errorCode, failMessage, GattInteractionCallback::onMtuChangeFailed);
    }

    @Override
    public void onCharacteristicChanged(SynchronousBleGatt gatt, BleGattCharacteristic characteristic, byte[] value) {
        connectionWrapper.onCharacteristicChanged(characteristic, value);
    }

    @Override
    public Function<Integer, Consumer<String>> onFail(SynchronousBleGatt synchronousBleGatt) {
        return null;
    }

    @Override
    public Function<Integer, Consumer<String>> onCharacteristicReadFailed(SynchronousBleGatt synchronousBleGatt) {
        return null;
    }

    @Override
    public Function<Integer, Consumer<String>> onMtuChangeFailed(SynchronousBleGatt synchronousBleGatt) {
        return null;
    }

    @Override
    public Function<Integer, Consumer<String>> onCharacteristicWriteFailed(SynchronousBleGatt synchronousBleGatt) {
        return null;
    }

    @Override
    public Function<Integer, Consumer<String>> onDescriptorReadFailed(SynchronousBleGatt synchronousBleGatt) {
        return null;
    }

    @Override
    public Function<Integer, Consumer<String>> onDescriptorWriteFailed(SynchronousBleGatt synchronousBleGatt) {
        return null;
    }

    //GattInteractionCallback, SynchronousBleGatt, Integer, String
    private void delegateFailToConnection(SynchronousBleGatt gatt,
                                          int errorCode,
                                          String failMessage,
                                          Function<GattInteractionCallback, Function<SynchronousBleGatt, Function<Integer, Consumer<String>>>> callbackFailMethod) {
        // delegate the async processing on existing connection
        callbackFailMethod.apply(connectionWrapper.asGattCallback()).apply(gatt).apply(errorCode).accept(failMessage);
    }

    private void delegateSuccessToConnection(SynchronousBleGatt gatt,
                                             BiConsumer<GattInteractionCallback, SynchronousBleGatt> callbackSuccessMethod) {
        // delegate the async processing on existing connection
        callbackSuccessMethod.accept(connectionWrapper.asGattCallback(), gatt);
    }

}