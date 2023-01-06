/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.util;

import android.app.Notification;

import com.decawave.argomanager.error.ui.MainActivity;

import org.jetbrains.annotations.NotNull;

//import rx.functions.Action0;

/**
 * Argo project.
 */
public interface AndroidPermissionHelper {

    boolean mkSureServicesEnabledAndPermissionsGranted(MainActivity mainActivity, @NotNull Notification.Action grantSuccessListener);

    /**
     * If services are not enabled and permissions are not granted, this returns false
     * and starts the grant process asynchronously.
     *
     * One can listen for the result of the grant process via the passed grantListener.
     *
     * @param mainActivity used to fire grant requests
     * @param grantSuccessListener is invoked after the grant/enable was accepted
     * @param grantFailListener is invoked after the grant/enable was rejected
     *
     * @return true if all is set up, false otherwise - means that asynchronous grant process has just started
     */
    boolean mkSureServicesEnabledAndPermissionsGranted(MainActivity mainActivity, Notification.Action grantSuccessListener, Notification.Action grantFailListener);

    boolean mkSureServicesEnabledAndPermissionsGranted(MainActivity mainActivity, Runnable grantSuccessListener);

    boolean mkSureServicesEnabledAndPermissionsGranted(MainActivity mainActivity, @NotNull Notification.Action grantSuccessListener, @NotNull Runnable grantFailListener);

    boolean mkSureServicesEnabledAndPermissionsGranted(MainActivity mainActivity, @NotNull Runnable grantSuccessListener, @NotNull Runnable grantFailListener);

    void startActivityToEnableLocationService(MainActivity mainActivity);

    boolean allSetUp();

}
