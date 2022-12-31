package com.decawave.argomanager.components.impl;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.components.NetworkNodeManager;
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
public final class BlePresenceApiImpl_Factory implements Factory<BlePresenceApiImpl> {
  private final Provider<DiscoveryApi> discoveryApiProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  public BlePresenceApiImpl_Factory(Provider<DiscoveryApi> discoveryApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider) {
    this.discoveryApiProvider = discoveryApiProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.bleConnectionApiProvider = bleConnectionApiProvider;
  }

  @Override
  public BlePresenceApiImpl get() {
    return newInstance(discoveryApiProvider.get(), networkNodeManagerProvider.get(), bleConnectionApiProvider.get());
  }

  public static BlePresenceApiImpl_Factory create(Provider<DiscoveryApi> discoveryApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider) {
    return new BlePresenceApiImpl_Factory(discoveryApiProvider, networkNodeManagerProvider, bleConnectionApiProvider);
  }

  public static BlePresenceApiImpl newInstance(DiscoveryApi discoveryApi,
      NetworkNodeManager networkNodeManager, BleConnectionApi bleConnectionApi) {
    return new BlePresenceApiImpl(discoveryApi, networkNodeManager, bleConnectionApi);
  }
}
