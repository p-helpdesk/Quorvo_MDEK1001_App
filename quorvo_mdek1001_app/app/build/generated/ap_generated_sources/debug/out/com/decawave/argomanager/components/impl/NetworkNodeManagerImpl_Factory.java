package com.decawave.argomanager.components.impl;

import com.decawave.argomanager.components.LocationDataLogger;
import com.decawave.argomanager.components.NetworkModelManager;
import com.decawave.argomanager.components.NetworksNodesStorage;
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
public final class NetworkNodeManagerImpl_Factory implements Factory<NetworkNodeManagerImpl> {
  private final Provider<NetworkModelManager> networkModelManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<LocationDataLogger> locationDataLoggerProvider;

  private final Provider<NetworksNodesStorage> storageProvider;

  private final Provider<UniqueReorderingStack<Short>> activeNetworkIdStackProvider;

  public NetworkNodeManagerImpl_Factory(Provider<NetworkModelManager> networkModelManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<LocationDataLogger> locationDataLoggerProvider,
      Provider<NetworksNodesStorage> storageProvider,
      Provider<UniqueReorderingStack<Short>> activeNetworkIdStackProvider) {
    this.networkModelManagerProvider = networkModelManagerProvider;
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.locationDataLoggerProvider = locationDataLoggerProvider;
    this.storageProvider = storageProvider;
    this.activeNetworkIdStackProvider = activeNetworkIdStackProvider;
  }

  @Override
  public NetworkNodeManagerImpl get() {
    NetworkNodeManagerImpl instance = newInstance(networkModelManagerProvider.get(), appPreferenceAccessorProvider.get(), locationDataLoggerProvider.get(), storageProvider.get(), activeNetworkIdStackProvider.get());
    NetworkNodeManagerImpl_MembersInjector.injectInit(instance);
    return instance;
  }

  public static NetworkNodeManagerImpl_Factory create(
      Provider<NetworkModelManager> networkModelManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<LocationDataLogger> locationDataLoggerProvider,
      Provider<NetworksNodesStorage> storageProvider,
      Provider<UniqueReorderingStack<Short>> activeNetworkIdStackProvider) {
    return new NetworkNodeManagerImpl_Factory(networkModelManagerProvider, appPreferenceAccessorProvider, locationDataLoggerProvider, storageProvider, activeNetworkIdStackProvider);
  }

  public static NetworkNodeManagerImpl newInstance(NetworkModelManager networkModelManager,
      AppPreferenceAccessor appPreferenceAccessor, LocationDataLogger locationDataLogger,
      NetworksNodesStorage storage, UniqueReorderingStack<Short> activeNetworkIdStack) {
    return new NetworkNodeManagerImpl(networkModelManager, appPreferenceAccessor, locationDataLogger, storage, activeNetworkIdStack);
  }
}
