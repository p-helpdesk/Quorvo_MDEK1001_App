package com.decawave.argomanager.util;

import com.decawave.argomanager.ble.BleAdapter;
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
public final class AndroidPermissionHelperImpl_Factory implements Factory<AndroidPermissionHelperImpl> {
  private final Provider<BleAdapter> bleAdapterProvider;

  public AndroidPermissionHelperImpl_Factory(Provider<BleAdapter> bleAdapterProvider) {
    this.bleAdapterProvider = bleAdapterProvider;
  }

  @Override
  public AndroidPermissionHelperImpl get() {
    return newInstance(bleAdapterProvider.get());
  }

  public static AndroidPermissionHelperImpl_Factory create(
      Provider<BleAdapter> bleAdapterProvider) {
    return new AndroidPermissionHelperImpl_Factory(bleAdapterProvider);
  }

  public static AndroidPermissionHelperImpl newInstance(BleAdapter bleAdapter) {
    return new AndroidPermissionHelperImpl(bleAdapter);
  }
}
