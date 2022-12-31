package com.decawave.argomanager.util;

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
public final class NetworkNodePropertyDecoratorImpl_Factory implements Factory<NetworkNodePropertyDecoratorImpl> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  public NetworkNodePropertyDecoratorImpl_Factory(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
  }

  @Override
  public NetworkNodePropertyDecoratorImpl get() {
    return newInstance(appPreferenceAccessorProvider.get());
  }

  public static NetworkNodePropertyDecoratorImpl_Factory create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    return new NetworkNodePropertyDecoratorImpl_Factory(appPreferenceAccessorProvider);
  }

  public static NetworkNodePropertyDecoratorImpl newInstance(
      AppPreferenceAccessor appPreferenceAccessor) {
    return new NetworkNodePropertyDecoratorImpl(appPreferenceAccessor);
  }
}
