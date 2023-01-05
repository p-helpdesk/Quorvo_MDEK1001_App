/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.util.gatt;

import androidx.annotation.NonNull;

import com.decawave.argomanager.components.DecodeContextManager;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ExecutionException;

import javax.inject.Inject;

/**
 * Argo project.
 */

public class GattDecoderCache {
    private final LoadingCache<String, GattDecoder> cache;

    @Inject
    public GattDecoderCache(DecodeContextManager decodeContextManager) {
        this.cache = CacheBuilder.newBuilder()
                .maximumSize(40).build(new CacheLoader<String, GattDecoder>() {
                    @Override
                    public @NotNull GattDecoder load(@NonNull String bleAddress) throws Exception {
                        return new GattDecoder(bleAddress, decodeContextManager.getOrCreateContext(bleAddress));
                    }
                });
    }

    public GattDecoder getDecoder(String deviceBleAddress) {
        try {
            return cache.get(deviceBleAddress);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
