package com.decawave.argomanager.error.ui.fragment;

import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.components.LocationDataLogger;
import com.decawave.argomanager.components.NetworkNodeManager;
import com.decawave.argomanager.debuglog.LogEntryCollector;
import com.decawave.argomanager.prefs.AppPreferenceAccessor;
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
public final class DeviceDebugConsoleFragment_MembersInjector implements MembersInjector<DeviceDebugConsoleFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<LogEntryCollector> logEntryCollectorProvider;

  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<DiscoveryManager> discoveryManagerProvider;

  private final Provider<LocationDataLogger> locationDataLoggerProvider;

  public DeviceDebugConsoleFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<LogEntryCollector> logEntryCollectorProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<LocationDataLogger> locationDataLoggerProvider) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.logEntryCollectorProvider = logEntryCollectorProvider;
    this.bleConnectionApiProvider = bleConnectionApiProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.locationDataLoggerProvider = locationDataLoggerProvider;
  }

  public static MembersInjector<DeviceDebugConsoleFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<LogEntryCollector> logEntryCollectorProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<LocationDataLogger> locationDataLoggerProvider) {
    return new DeviceDebugConsoleFragment_MembersInjector(appPreferenceAccessorProvider, logEntryCollectorProvider, bleConnectionApiProvider, networkNodeManagerProvider, discoveryManagerProvider, locationDataLoggerProvider);
  }

  @Override
  public void injectMembers(DeviceDebugConsoleFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    LogBufferFragment_MembersInjector.injectLogEntryCollector(instance, logEntryCollectorProvider.get());
    injectBleConnectionApi(instance, bleConnectionApiProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectDiscoveryManager(instance, discoveryManagerProvider.get());
    injectLocationDataLogger(instance, locationDataLoggerProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DeviceDebugConsoleFragment.bleConnectionApi")
  public static void injectBleConnectionApi(DeviceDebugConsoleFragment instance,
      BleConnectionApi bleConnectionApi) {
    instance.bleConnectionApi = bleConnectionApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DeviceDebugConsoleFragment.networkNodeManager")
  public static void injectNetworkNodeManager(DeviceDebugConsoleFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DeviceDebugConsoleFragment.discoveryManager")
  public static void injectDiscoveryManager(DeviceDebugConsoleFragment instance,
      DiscoveryManager discoveryManager) {
    instance.discoveryManager = discoveryManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DeviceDebugConsoleFragment.locationDataLogger")
  public static void injectLocationDataLogger(DeviceDebugConsoleFragment instance,
      LocationDataLogger locationDataLogger) {
    instance.locationDataLogger = locationDataLogger;
  }
}
