/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.ui.fragment;

import com.decawave.argomanager.R;
import com.decawave.argomanager.components.AutoPositioningManager;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.ioc.IocContext;
import com.decawave.argomanager.util.AndroidPermissionHelper;

import java.util.function.Consumer;
import java.util.function.Function;

//import rx.functions.Action1;
//import rx.functions.Func0;

/**
 * Distinct fragment types.
 */
public enum FragmentType {
    OVERVIEW((x) -> new OverviewFragment()),
    GRID((x) -> new GridFragment(), (newFragmentType) -> {
        // onExit
        if (newFragmentType == OVERVIEW) {
            IocContext.daCtx.getBleConnectionApi().limitLowPriorityConnections(-1);
        }
    }, (oldFragmentType) -> {
        // onEnter
        if (oldFragmentType == null || oldFragmentType == OVERVIEW) {
            IocContext.daCtx.getBleConnectionApi().limitLowPriorityConnections(2);
        }
    }),
    SETTINGS(R.string.screen_title_settings, (x) -> new SettingsFragment()),
    DEBUG_LOG(R.string.screen_title_debug_log, (x) -> new DebugLogBufferFragment()),
    DEVICE_DEBUG_CONSOLE(R.string.screen_title_debug_console, (x) -> new DeviceDebugConsoleFragment()),
    POSITION_LOG(R.string.screen_title_position_log, (x) -> new PositionLogBufferFragment()),
    DISCOVERY(R.string.screen_title_discovery, (x) -> new DiscoveryFragment(), false, (newFragmentType) -> {
        // onExit
        if (newFragmentType.mainScreen) {
            // we are returning to the main screen, reset and stop the discovery
            DiscoveryManager discoveryManager = IocContext.daCtx.getDiscoveryManager();
            discoveryManager.stopDiscoveryIfRunning();
            if (DiscoveryFragment.networkAssignmentRunner != null) {
                if (!DiscoveryFragment.networkAssignmentRunner.getOverallStatus().terminal) {
                    // terminate the runner
                    DiscoveryFragment.networkAssignmentRunner.terminate();
                }
                // and forget the reference
                DiscoveryFragment.networkAssignmentRunner = null;
            }
        }
    }, (oldFragmentType) -> {
        // onEnter
        if (oldFragmentType != null && oldFragmentType.mainScreen) {
            AndroidPermissionHelper permissionHelper = IocContext.daCtx.getPermissionHelper();
            if (permissionHelper.allSetUp()) {
                DiscoveryManager discoveryManager = IocContext.daCtx.getDiscoveryManager();
                discoveryManager.startTimeLimitedDiscovery(true);
            }
        }
    }),
    NODE_DETAILS(R.string.screen_title_node_details, (x) -> new NodeDetailFragment(), true, null),
    DEVICE_ERRORS(R.string.screen_title_problematic_nodes, (x) -> new DeviceErrorFragment()),
    AUTO_POSITIONING(R.string.screen_title_auto_positioning, (x) -> new AutoPositioningFragment(), false, (newFragmentType) -> {
        if (newFragmentType.mainScreen) {
            // we are returning to the main screen, terminate the manager
            AutoPositioningManager autoPositioningManager = IocContext.daCtx.getAutoPositioningManager();
            if (!autoPositioningManager.getApplicationState().idle) autoPositioningManager.terminate();
        }
    }),
    FIRMWARE_UPDATE(R.string.screen_title_firmware_update, (x) -> new FirmwareUpdateFragment(), false, (newFragmentType) -> {
        if (newFragmentType.mainScreen) {
            if (FirmwareUpdateFragment.firmwareUpdateRunner != null && FirmwareUpdateFragment.firmwareUpdateRunner.getOverallStatus().terminal) {
                // we are returning to the main screen, and the runner is finished, reset the runner
                FirmwareUpdateFragment.firmwareUpdateRunner = null;
            }
        }
    }),
    AP_PREVIEW(R.string.ap_preview, (x) -> new ApPreviewFragment());
    //INSTRUCTIONS(R.string.screen_title_instructions, (x) -> new InstructionsFragment());

    public final boolean mainScreen;
    public final boolean hasScreenTitle;
    public final boolean fullScreenDialog;
    public final int screenTitleId;
    public final Consumer<FragmentType> onFragmentLeft;
    public final Consumer<FragmentType> onFragmentEntered;

    private final Function<AbstractArgoFragment, AbstractArgoFragment> factory;

    FragmentType(Function<AbstractArgoFragment, AbstractArgoFragment> instanceFactory) {
        this(instanceFactory, null, null);
    }

    FragmentType(Function<AbstractArgoFragment, AbstractArgoFragment> instanceFactory,
                 Consumer<FragmentType> onFragmentLeft,
                 Consumer<FragmentType> onFragmentEntered) {
        this.mainScreen = true;
        this.fullScreenDialog = false;
        this.hasScreenTitle = false;
        this.factory = instanceFactory;
        this.screenTitleId = -1;
        this.onFragmentLeft = onFragmentLeft;
        this.onFragmentEntered = onFragmentEntered;
    }

    FragmentType(int screenTitleId, Function<AbstractArgoFragment, AbstractArgoFragment> instanceFactory) {
        this(screenTitleId, instanceFactory, false, null);
    }

    FragmentType(int screenTitleId, Function<AbstractArgoFragment, AbstractArgoFragment> instanceFactory, boolean fullscreenDialog, Consumer<FragmentType> onFragmentLeft) {
        this(screenTitleId, instanceFactory, fullscreenDialog, onFragmentLeft, null);
    }

    FragmentType(int screenTitleId,
                 Function<AbstractArgoFragment, AbstractArgoFragment> instanceFactory,
                 boolean fullscreenDialog,
                 Consumer<FragmentType> onFragmentLeft,
                 Consumer<FragmentType> onFragmentEntered) {
        this.mainScreen = false;
        this.hasScreenTitle = true;
        this.fullScreenDialog = fullscreenDialog;
        this.screenTitleId = screenTitleId;
        this.factory = instanceFactory;
        this.onFragmentLeft = onFragmentLeft;
        this.onFragmentEntered = onFragmentEntered;
    }

//    public AbstractArgoFragment newInstance() {
//        return factory.apply();
//    }
    public AbstractArgoFragment newInstance() {
        return null;
    }

}