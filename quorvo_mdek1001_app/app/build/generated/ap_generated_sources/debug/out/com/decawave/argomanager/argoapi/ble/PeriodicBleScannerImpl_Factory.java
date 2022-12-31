package com.decawave.argomanager.argoapi.ble;

import com.decawave.argomanager.ble.BleAdapter;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
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
public final class PeriodicBleScannerImpl_Factory implements Factory<PeriodicBleScannerImpl> {
  private final Provider<BleAdapter> bleAdapterSupplierProvider;

  public PeriodicBleScannerImpl_Factory(Provider<BleAdapter> bleAdapterSupplierProvider) {
    this.bleAdapterSupplierProvider = bleAdapterSupplierProvider;
  }

  @Override
  public PeriodicBleScannerImpl get() {
    return newInstance(DoubleCheck.lazy(bleAdapterSupplierProvider));
  }

  public static PeriodicBleScannerImpl_Factory create(
      Provider<BleAdapter> bleAdapterSupplierProvider) {
    return new PeriodicBleScannerImpl_Factory(bleAdapterSupplierProvider);
  }

  public static PeriodicBleScannerImpl newInstance(Lazy<BleAdapter> bleAdapterSupplier) {
    return new PeriodicBleScannerImpl(bleAdapterSupplier);
  }
}
