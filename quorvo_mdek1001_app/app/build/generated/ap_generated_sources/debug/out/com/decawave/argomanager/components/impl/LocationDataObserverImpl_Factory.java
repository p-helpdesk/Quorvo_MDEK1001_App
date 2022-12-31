package com.decawave.argomanager.components.impl;

import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.components.BlePresenceApi;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.components.NetworkNodeManager;
import com.decawave.argomanager.prefs.AppPreferenceAccessor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocationDataObserverImpl_Factory implements Factory<LocationDataObserverImpl> {
  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  private final Provider<DiscoveryManager> discoveryManagerProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<BlePresenceApi> blePresenceApiProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  public LocationDataObserverImpl_Factory(Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<BlePresenceApi> blePresenceApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    this.bleConnectionApiProvider = bleConnectionApiProvider;
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.blePresenceApiProvider = blePresenceApiProvider;
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
  }

  @Override
  public LocationDataObserverImpl get() {
    return newInstance(bleConnectionApiProvider.get(), discoveryManagerProvider.get(), networkNodeManagerProvider.get(), blePresenceApiProvider.get(), appPreferenceAccessorProvider.get());
  }

  public static LocationDataObserverImpl_Factory create(
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<BlePresenceApi> blePresenceApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    return new LocationDataObserverImpl_Factory(bleConnectionApiProvider, discoveryManagerProvider, networkNodeManagerProvider, blePresenceApiProvider, appPreferenceAccessorProvider);
  }

  public static LocationDataObserverImpl newInstance(BleConnectionApi bleConnectionApi,
      DiscoveryManager discoveryManager, NetworkNodeManager networkNodeManager,
      BlePresenceApi blePresenceApi, AppPreferenceAccessor appPreferenceAccessor) {
    return new LocationDataObserverImpl(bleConnectionApi, discoveryManager, networkNodeManager, blePresenceApi, appPreferenceAccessor);
  }
}
