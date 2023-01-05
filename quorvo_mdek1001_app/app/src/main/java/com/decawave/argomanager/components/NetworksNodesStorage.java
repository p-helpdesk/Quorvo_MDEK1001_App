/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.components;

import com.decawave.argomanager.components.struct.NetworkNodeEnhanced;

import java.util.Collection;
import java.util.function.BiConsumer;

/**
 * Network model storage/persistence.
 */
public interface NetworksNodesStorage {

    void save(Collection<NetworkNodeEnhanced> nodes,
              Collection<NetworkModel> networks);

    void load(BiConsumer<Collection<NetworkNodeEnhanced>, Collection<NetworkModel>> callback);

}
