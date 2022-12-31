package com.decawave.argomanager.components.impl;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.annotation.Generated;

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
public final class NetworkNodeManagerImpl_MembersInjector implements MembersInjector<NetworkNodeManagerImpl> {
  public NetworkNodeManagerImpl_MembersInjector() {
  }

  public static MembersInjector<NetworkNodeManagerImpl> create() {
    return new NetworkNodeManagerImpl_MembersInjector();
  }

  @Override
  public void injectMembers(NetworkNodeManagerImpl instance) {
    injectInit(instance);
  }

  public static void injectInit(NetworkNodeManagerImpl instance) {
    instance.init();
  }
}
