/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.argoapi.ble.connection;

import android.app.Notification;

import com.decawave.argo.api.interaction.Fail;
import com.decawave.argo.api.interaction.NetworkNodeConnection;
import com.decawave.argomanager.ble.ConnectionSpeed;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

//import rx.functions.Action0;
//import rx.functions.Action1;

/**
 * BLE-specific methods of a network node connection.
 */
public interface NetworkNodeBleConnection extends NetworkNodeConnection {

    void setConnectionSpeed(@NotNull ConnectionSpeed connectionSpeed);

    void changeMtu(int mtu, @Nullable Notification.Action onSuccessCallback, @Nullable Consumer<Fail> onFailCallback);

}
