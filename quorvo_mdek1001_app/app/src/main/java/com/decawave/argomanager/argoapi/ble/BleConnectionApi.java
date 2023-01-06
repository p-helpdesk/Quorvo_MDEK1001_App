/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.argoapi.ble;

import android.app.Notification;

import com.decawave.argo.api.ConnectionState;
import com.decawave.argo.api.GenericConnectionApi;
import com.decawave.argo.api.YesNoAsync;
import com.decawave.argo.api.interaction.Fail;
import com.decawave.argo.api.interaction.NetworkNodeConnection;
import com.decawave.argo.api.struct.ConnectPriority;
import com.decawave.argomanager.argoapi.ble.connection.NetworkNodeBleConnection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Manages connections to ARGO network elements (anchors, tags).
 */
public interface BleConnectionApi extends GenericConnectionApi<String> {

    ///////////////////////////////////////////////////////////////////////////
    // additional notification/information routines
    ///////////////////////////////////////////////////////////////////////////
    void onSessionError(@NotNull String bleAddress, int errorCode);

    /**
     * Limits number of concurrently running low-priority connections.
     * @param limit limit, if -1 = use default limit
     */
    void limitLowPriorityConnections(int limit);

    /**
     * @return true if the connection is disconnected (closed, pending) for sure
     */
    boolean isClosedOrPending(@NotNull String bleAddress);

    /**
     * @return true if all connections are CLOSED (or there is not connetion at all)
     */
    boolean allConnectionsClosed();

    /**
     * Return the connection state with affinity to CONNECTED state.
     * Please note that there might be multiple connection requests enqueued,
     * but this returns:
     * - CLOSED if there is no connection or all connections are CLOSED
     * - PENDING if there is at least one PENDING connection and no CONNECTING/CONNECTED/DISCONNECTING
     * - CONNECTING, CONNECTED or DISCONNECTING if there exists one
     *
     * @param bleAddress identifies the other side of the connection
     * @return connection state of the given node
     */
    @NotNull
    ConnectionState getConnectionState(@NotNull String bleAddress);

    NetworkNodeBleConnection connect(@NotNull String address,
                                     @NotNull ConnectPriority connectPriority,
                                     @NotNull Consumer<NetworkNodeConnection> onConnectedCallback,
                                     @Nullable BiConsumer<NetworkNodeConnection, Fail> onFailCallback,
                                     @Nullable BiConsumer<NetworkNodeConnection, Integer> onDisconnectedCallback);

    NetworkNodeConnection connect(@NotNull String address,
                                  @NotNull ConnectPriority connectPriority,
                                  @NotNull Consumer<NetworkNodeConnection> onConnectedCallback,
                                  @Nullable com.annimon.stream.function.BiConsumer<NetworkNodeConnection, Fail> onFailCallback,
                                  @Nullable com.annimon.stream.function.BiConsumer<NetworkNodeConnection, Integer> onDisconnectedCallback);

    Boolean lastSessionSuccessful(@NotNull String bleAddress);

    /**
     * Removes any error flag in the current session/connection and enforces
     * that any further reported error is ignored.
     */
    void ignoreSessionErrors(String deviceAddress);

    /**
     * @see ConnectionState
     */
    Set<String> getInProgressDevices();

    void blockConnectionRequests(Notification.Action onBlocked);

    void unblockConnectionRequests();

    YesNoAsync connectionRequestsBlocked();

}
