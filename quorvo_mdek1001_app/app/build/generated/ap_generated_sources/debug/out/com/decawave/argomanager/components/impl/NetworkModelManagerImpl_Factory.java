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
public final class NetworkModelManagerImpl_Factory implements Factory<NetworkModelManagerImpl> {
  @Override
  public NetworkModelManagerImpl get() {
    return newInstance();
  }

  public static NetworkModelManagerImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NetworkModelManagerImpl newInstance() {
    return new NetworkModelManagerImpl();
  }

  private static final class InstanceHolder {
    private static final NetworkModelManagerImpl_Factory INSTANCE = new NetworkModelManagerImpl_Factory();
  }
}
