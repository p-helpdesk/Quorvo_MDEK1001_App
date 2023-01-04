package com.decawave.argomanager;

import com.decawave.argomanager.components.BlePresenceApi;
import com.decawave.argomanager.components.NetworkNodeManager;
import com.decawave.argomanager.components.impl.UniqueReorderingStack;
import com.decawave.argomanager.debuglog.LogEntryCollector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

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
public final class ArgoApp_MembersInjector implements MembersInjector<ArgoApp> {
  private final Provider<BlePresenceApi> blePresenceApiProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<LogEntryCollector> logEntryCollectorProvider;

  private final Provider<UniqueReorderingStack<Short>> activeNetworkStackProvider;

  public ArgoApp_MembersInjector(Provider<BlePresenceApi> blePresenceApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<LogEntryCollector> logEntryCollectorProvider,
      Provider<UniqueReorderingStack<Short>> activeNetworkStackProvider) {
    this.blePresenceApiProvider = blePresenceApiProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.logEntryCollectorProvider = logEntryCollectorProvider;
    this.activeNetworkStackProvider = activeNetworkStackProvider;
  }

  public static MembersInjector<ArgoApp> create(Provider<BlePresenceApi> blePresenceApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<LogEntryCollector> logEntryCollectorProvider,
      Provider<UniqueReorderingStack<Short>> activeNetworkStackProvider) {
    return new ArgoApp_MembersInjector(blePresenceApiProvider, networkNodeManagerProvider, logEntryCollectorProvider, activeNetworkStackProvider);
  }

  @Override
  public void injectMembers(ArgoApp instance) {
    injectBlePresenceApi(instance, blePresenceApiProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectLogEntryCollector(instance, logEntryCollectorProvider.get());
    injectActiveNetworkStack(instance, activeNetworkStackProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ArgoApp.blePresenceApi")
  public static void injectBlePresenceApi(ArgoApp instance, BlePresenceApi blePresenceApi) {
    instance.blePresenceApi = blePresenceApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ArgoApp.networkNodeManager")
  public static void injectNetworkNodeManager(ArgoApp instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ArgoApp.logEntryCollector")
  public static void injectLogEntryCollector(ArgoApp instance,
      LogEntryCollector logEntryCollector) {
    instance.logEntryCollector = logEntryCollector;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ArgoApp.activeNetworkStack")
  public static void injectActiveNetworkStack(ArgoApp instance,
      UniqueReorderingStack<Short> activeNetworkStack) {
    instance.activeNetworkStack = activeNetworkStack;
  }
}
