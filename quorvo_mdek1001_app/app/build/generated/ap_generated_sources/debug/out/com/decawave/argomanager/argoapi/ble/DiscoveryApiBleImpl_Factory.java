package com.decawave.argomanager.argoapi.ble;

import com.decawave.argomanager.util.gatt.GattDecoderCache;
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
public final class DiscoveryApiBleImpl_Factory implements Factory<DiscoveryApiBleImpl> {
  private final Provider<PeriodicBleScanner> bleScannerProvider;

  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  private final Provider<GattDecoderCache> gattDecoderCacheProvider;

  public DiscoveryApiBleImpl_Factory(Provider<PeriodicBleScanner> bleScannerProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<GattDecoderCache> gattDecoderCacheProvider) {
    this.bleScannerProvider = bleScannerProvider;
    this.bleConnectionApiProvider = bleConnectionApiProvider;
    this.gattDecoderCacheProvider = gattDecoderCacheProvider;
  }

  @Override
  public DiscoveryApiBleImpl get() {
    return newInstance(bleScannerProvider.get(), bleConnectionApiProvider.get(), gattDecoderCacheProvider.get());
  }

  public static DiscoveryApiBleImpl_Factory create(Provider<PeriodicBleScanner> bleScannerProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<GattDecoderCache> gattDecoderCacheProvider) {
    return new DiscoveryApiBleImpl_Factory(bleScannerProvider, bleConnectionApiProvider, gattDecoderCacheProvider);
  }

  public static DiscoveryApiBleImpl newInstance(PeriodicBleScanner bleScanner,
      BleConnectionApi bleConnectionApi, GattDecoderCache gattDecoderCache) {
    return new DiscoveryApiBleImpl(bleScanner, bleConnectionApi, gattDecoderCache);
  }
}
