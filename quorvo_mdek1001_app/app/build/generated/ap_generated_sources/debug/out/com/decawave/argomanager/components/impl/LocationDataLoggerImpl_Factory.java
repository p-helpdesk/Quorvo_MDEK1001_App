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
public final class LocationDataLoggerImpl_Factory implements Factory<LocationDataLoggerImpl> {
  @Override
  public LocationDataLoggerImpl get() {
    return newInstance();
  }

  public static LocationDataLoggerImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LocationDataLoggerImpl newInstance() {
    return new LocationDataLoggerImpl();
  }

  private static final class InstanceHolder {
    private static final LocationDataLoggerImpl_Factory INSTANCE = new LocationDataLoggerImpl_Factory();
  }
}
