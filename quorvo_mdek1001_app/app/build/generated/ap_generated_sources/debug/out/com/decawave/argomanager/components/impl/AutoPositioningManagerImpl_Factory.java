package com.decawave.argomanager.components.impl;

import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
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
public final class AutoPositioningManagerImpl_Factory implements Factory<AutoPositioningManagerImpl> {
  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  public AutoPositioningManagerImpl_Factory(Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider) {
    this.bleConnectionApiProvider = bleConnectionApiProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
  }

  @Override
  public AutoPositioningManagerImpl get() {
    return newInstance(bleConnectionApiProvider.get(), networkNodeManagerProvider.get());
  }

  public static AutoPositioningManagerImpl_Factory create(
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider) {
    return new AutoPositioningManagerImpl_Factory(bleConnectionApiProvider, networkNodeManagerProvider);
  }

  public static AutoPositioningManagerImpl newInstance(BleConnectionApi bleConnectionApi,
      NetworkNodeManager networkNodeManager) {
    return new AutoPositioningManagerImpl(bleConnectionApi, networkNodeManager);
  }
}
