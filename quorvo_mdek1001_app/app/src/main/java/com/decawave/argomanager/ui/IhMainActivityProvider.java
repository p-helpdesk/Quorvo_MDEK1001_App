/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.ui;

import java.util.function.Consumer;

import eu.kryl.android.common.hub.SingletonHandler;

/**
 * Argo project.
 */

public interface IhMainActivityProvider extends SingletonHandler {

    void provideMainActivity(Consumer<MainActivity> actionOnMainActivity);

}
