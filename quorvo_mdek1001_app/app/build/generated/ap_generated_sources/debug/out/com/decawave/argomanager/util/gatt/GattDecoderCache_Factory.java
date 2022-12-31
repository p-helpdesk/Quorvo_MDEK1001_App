package com.decawave.argomanager.util.gatt;

import com.decawave.argomanager.components.DecodeContextManager;
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
public final class GattDecoderCache_Factory implements Factory<GattDecoderCache> {
  private final Provider<DecodeContextManager> decodeContextManagerProvider;

  public GattDecoderCache_Factory(Provider<DecodeContextManager> decodeContextManagerProvider) {
    this.decodeContextManagerProvider = decodeContextManagerProvider;
  }

  @Override
  public GattDecoderCache get() {
    return newInstance(decodeContextManagerProvider.get());
  }

  public static GattDecoderCache_Factory create(
      Provider<DecodeContextManager> decodeContextManagerProvider) {
    return new GattDecoderCache_Factory(decodeContextManagerProvider);
  }

  public static GattDecoderCache newInstance(DecodeContextManager decodeContextManager) {
    return new GattDecoderCache(decodeContextManager);
  }
}
