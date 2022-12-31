package com.decawave.argomanager.components.impl;

import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.prefs.AppPreferenceAccessor;
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
public final class ErrorManagerImpl_Factory implements Factory<ErrorManagerImpl> {
  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  public ErrorManagerImpl_Factory(Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    this.bleConnectionApiProvider = bleConnectionApiProvider;
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
  }

  @Override
  public ErrorManagerImpl get() {
    return newInstance(bleConnectionApiProvider.get(), appPreferenceAccessorProvider.get());
  }

  public static ErrorManagerImpl_Factory create(Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    return new ErrorManagerImpl_Factory(bleConnectionApiProvider, appPreferenceAccessorProvider);
  }

  public static ErrorManagerImpl newInstance(BleConnectionApi bleConnectionApi,
      AppPreferenceAccessor appPreferenceAccessor) {
    return new ErrorManagerImpl(bleConnectionApi, appPreferenceAccessor);
  }
}
