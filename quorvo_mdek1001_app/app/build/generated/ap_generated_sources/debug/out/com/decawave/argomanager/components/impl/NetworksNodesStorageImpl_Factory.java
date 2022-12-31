package com.decawave.argomanager.components.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

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
public final class NetworksNodesStorageImpl_Factory implements Factory<NetworksNodesStorageImpl> {
  @Override
  public NetworksNodesStorageImpl get() {
    return newInstance();
  }

  public static NetworksNodesStorageImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NetworksNodesStorageImpl newInstance() {
    return new NetworksNodesStorageImpl();
  }

  private static final class InstanceHolder {
    private static final NetworksNodesStorageImpl_Factory INSTANCE = new NetworksNodesStorageImpl_Factory();
  }
}
