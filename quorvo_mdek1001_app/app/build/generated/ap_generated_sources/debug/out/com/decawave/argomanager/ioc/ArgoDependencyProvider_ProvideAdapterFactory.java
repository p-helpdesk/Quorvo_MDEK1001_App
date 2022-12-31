package com.decawave.argomanager.ioc;

import com.decawave.argomanager.ble.BleAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ArgoDependencyProvider_ProvideAdapterFactory implements Factory<BleAdapter> {
  private final ArgoDependencyProvider module;

  public ArgoDependencyProvider_ProvideAdapterFactory(ArgoDependencyProvider module) {
    this.module = module;
  }

  @Override
  public BleAdapter get() {
    return provideAdapter(module);
  }

  public static ArgoDependencyProvider_ProvideAdapterFactory create(ArgoDependencyProvider module) {
    return new ArgoDependencyProvider_ProvideAdapterFactory(module);
  }

  public static BleAdapter provideAdapter(ArgoDependencyProvider instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideAdapter());
  }
}
