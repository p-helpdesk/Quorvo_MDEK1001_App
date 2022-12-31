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
public final class DecodeContextManagerImpl_Factory implements Factory<DecodeContextManagerImpl> {
  @Override
  public DecodeContextManagerImpl get() {
    return newInstance();
  }

  public static DecodeContextManagerImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DecodeContextManagerImpl newInstance() {
    return new DecodeContextManagerImpl();
  }

  private static final class InstanceHolder {
    private static final DecodeContextManagerImpl_Factory INSTANCE = new DecodeContextManagerImpl_Factory();
  }
}
