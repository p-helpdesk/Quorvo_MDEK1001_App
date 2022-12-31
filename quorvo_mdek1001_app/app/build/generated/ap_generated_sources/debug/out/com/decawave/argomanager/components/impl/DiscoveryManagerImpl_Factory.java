package com.decawave.argomanager.components.impl;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.components.BlePresenceApi;
import com.decawave.argomanager.components.NetworkNodeManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class DiscoveryManagerImpl_Factory implements Factory<DiscoveryManagerImpl> {
  private final Provider<DiscoveryApi> discoveryApiProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<BlePresenceApi> blePresenceApiProvider;

  public DiscoveryManagerImpl_Factory(Provider<DiscoveryApi> discoveryApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<BlePresenceApi> blePresenceApiProvider) {
    this.discoveryApiProvider = discoveryApiProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.blePresenceApiProvider = blePresenceApiProvider;
  }

  @Override
  public DiscoveryManagerImpl get() {
    return newInstance(discoveryApiProvider.get(), networkNodeManagerProvider.get(), blePresenceApiProvider.get());
  }

  public static DiscoveryManagerImpl_Factory create(Provider<DiscoveryApi> discoveryApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<BlePresenceApi> blePresenceApiProvider) {
    return new DiscoveryManagerImpl_Factory(discoveryApiProvider, networkNodeManagerProvider, blePresenceApiProvider);
  }

  public static DiscoveryManagerImpl newInstance(DiscoveryApi discoveryApi,
      NetworkNodeManager networkNodeManager, BlePresenceApi blePresenceApi) {
    return new DiscoveryManagerImpl(discoveryApi, networkNodeManager, blePresenceApi);
  }
}
