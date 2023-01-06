/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2023, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.error.ui.actionbar;

import com.decawave.argomanager.error.ui.fragment.FragmentType;

/**
 * Argo project.
 */

public interface SpinnerItem {

    FragmentType getFragmentType();

    int getTitleResId();

}
