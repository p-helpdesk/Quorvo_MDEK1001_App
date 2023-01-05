/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.argoapi.ble;

import eu.kryl.android.common.hub.InterfaceHubHandler;
//import rx.functions.Action1;

/**
 * Listens to firmware update events.
 *
 * @see //com.decawave.argo.api.interaction.NetworkNodeConnection#uploadFirmware(FirmwareMeta, InputStream, Notification.Action, Consumer, Consumer)
 */
public interface IhFirmwareUploadListener extends InterfaceHubHandler {

    void onInitiating(String bleAddress);

    void onUploading(String bleAddress);

    // this callback is called optionally
    void onCleaningUp(String bleAddress);

    void onFinished(String bleAddress);

}
