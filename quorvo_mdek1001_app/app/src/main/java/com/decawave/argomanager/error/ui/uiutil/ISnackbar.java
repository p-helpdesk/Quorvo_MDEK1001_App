/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2023, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.error.ui.uiutil;

import android.view.View;

/**
 * Argo project.
 */

public interface ISnackbar {

    void show();

    ISnackbar setAction(int resId, View.OnClickListener listener);

}
