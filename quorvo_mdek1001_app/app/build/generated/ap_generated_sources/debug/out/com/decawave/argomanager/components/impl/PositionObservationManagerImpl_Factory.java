package com.decawave.argomanager.components.impl;

import com.decawave.argomanager.components.LocationDataObserver;
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
public final class PositionObservationManagerImpl_Factory implements Factory<PositionObservationManagerImpl> {
  private final Provider<LocationDataObserver> locationDataObserverProvider;

  public PositionObservationManagerImpl_Factory(
      Provider<LocationDataObserver> locationDataObserverProvider) {
    this.locationDataObserverProvider = locationDataObserverProvider;
  }

  @Override
  public PositionObservationManagerImpl get() {
    return newInstance(locationDataObserverProvider.get());
  }

  public static PositionObservationManagerImpl_Factory create(
      Provider<LocationDataObserver> locationDataObserverProvider) {
    return new PositionObservationManagerImpl_Factory(locationDataObserverProvider);
  }

  public static PositionObservationManagerImpl newInstance(
      LocationDataObserver locationDataObserver) {
    return new PositionObservationManagerImpl(locationDataObserver);
  }
}
