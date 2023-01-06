package com.decawave.argomanager.error.ui.fragment;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.ble.signal.SignalStrengthInterpreter;
import com.decawave.argomanager.components.AutoPositioningManager;
import com.decawave.argomanager.components.BlePresenceApi;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.components.ErrorManager;
import com.decawave.argomanager.components.LocationDataObserver;
import com.decawave.argomanager.components.NetworkNodeManager;
import com.decawave.argomanager.prefs.AppPreferenceAccessor;
import com.decawave.argomanager.util.AndroidPermissionHelper;
import com.decawave.argomanager.util.NetworkNodePropertyDecorator;
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
public final class OverviewFragment_MembersInjector implements MembersInjector<OverviewFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<DiscoveryApi> discoveryApiProvider;

  private final Provider<ErrorManager> errorManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<DiscoveryManager> discoveryManagerProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider2;

  private final Provider<SignalStrengthInterpreter> signalStrengthInterpreterProvider;

  private final Provider<NetworkNodePropertyDecorator> propertyDecoratorProvider;

  private final Provider<ErrorManager> errorManagerProvider2;

  private final Provider<AndroidPermissionHelper> permissionHelperProvider;

  private final Provider<BlePresenceApi> presenceApiProvider;

  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  private final Provider<AutoPositioningManager> autoPositioningManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3;

  private final Provider<LocationDataObserver> locationDataObserverProvider;

  public OverviewFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider2,
      Provider<SignalStrengthInterpreter> signalStrengthInterpreterProvider,
      Provider<NetworkNodePropertyDecorator> propertyDecoratorProvider,
      Provider<ErrorManager> errorManagerProvider2,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BlePresenceApi> presenceApiProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<AutoPositioningManager> autoPositioningManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3,
      Provider<LocationDataObserver> locationDataObserverProvider) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.discoveryApiProvider = discoveryApiProvider;
    this.errorManagerProvider = errorManagerProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.networkNodeManagerProvider2 = networkNodeManagerProvider2;
    this.signalStrengthInterpreterProvider = signalStrengthInterpreterProvider;
    this.propertyDecoratorProvider = propertyDecoratorProvider;
    this.errorManagerProvider2 = errorManagerProvider2;
    this.permissionHelperProvider = permissionHelperProvider;
    this.presenceApiProvider = presenceApiProvider;
    this.bleConnectionApiProvider = bleConnectionApiProvider;
    this.autoPositioningManagerProvider = autoPositioningManagerProvider;
    this.appPreferenceAccessorProvider3 = appPreferenceAccessorProvider3;
    this.locationDataObserverProvider = locationDataObserverProvider;
  }

  public static MembersInjector<OverviewFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider2,
      Provider<SignalStrengthInterpreter> signalStrengthInterpreterProvider,
      Provider<NetworkNodePropertyDecorator> propertyDecoratorProvider,
      Provider<ErrorManager> errorManagerProvider2,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BlePresenceApi> presenceApiProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<AutoPositioningManager> autoPositioningManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3,
      Provider<LocationDataObserver> locationDataObserverProvider) {
    return new OverviewFragment_MembersInjector(appPreferenceAccessorProvider, discoveryApiProvider, errorManagerProvider, appPreferenceAccessorProvider2, networkNodeManagerProvider, discoveryManagerProvider, networkNodeManagerProvider2, signalStrengthInterpreterProvider, propertyDecoratorProvider, errorManagerProvider2, permissionHelperProvider, presenceApiProvider, bleConnectionApiProvider, autoPositioningManagerProvider, appPreferenceAccessorProvider3, locationDataObserverProvider);
  }

  @Override
  public void injectMembers(OverviewFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, discoveryApiProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, errorManagerProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
    MainScreenFragment_MembersInjector.injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectDiscoveryManager(instance, discoveryManagerProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider2.get());
    injectSignalStrengthInterpreter(instance, signalStrengthInterpreterProvider.get());
    injectPropertyDecorator(instance, propertyDecoratorProvider.get());
    injectErrorManager(instance, errorManagerProvider2.get());
    injectPermissionHelper(instance, permissionHelperProvider.get());
    injectPresenceApi(instance, presenceApiProvider.get());
    injectBleConnectionApi(instance, bleConnectionApiProvider.get());
    injectAutoPositioningManager(instance, autoPositioningManagerProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider3.get());
    injectLocationDataObserver(instance, locationDataObserverProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.discoveryManager")
  public static void injectDiscoveryManager(OverviewFragment instance,
      DiscoveryManager discoveryManager) {
    instance.discoveryManager = discoveryManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.networkNodeManager")
  public static void injectNetworkNodeManager(OverviewFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.signalStrengthInterpreter")
  public static void injectSignalStrengthInterpreter(OverviewFragment instance,
      SignalStrengthInterpreter signalStrengthInterpreter) {
    instance.signalStrengthInterpreter = signalStrengthInterpreter;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.propertyDecorator")
  public static void injectPropertyDecorator(OverviewFragment instance,
      NetworkNodePropertyDecorator propertyDecorator) {
    instance.propertyDecorator = propertyDecorator;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.errorManager")
  public static void injectErrorManager(OverviewFragment instance, ErrorManager errorManager) {
    instance.errorManager = errorManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.permissionHelper")
  public static void injectPermissionHelper(OverviewFragment instance,
      AndroidPermissionHelper permissionHelper) {
    instance.permissionHelper = permissionHelper;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.presenceApi")
  public static void injectPresenceApi(OverviewFragment instance, BlePresenceApi presenceApi) {
    instance.presenceApi = presenceApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.bleConnectionApi")
  public static void injectBleConnectionApi(OverviewFragment instance,
      BleConnectionApi bleConnectionApi) {
    instance.bleConnectionApi = bleConnectionApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.autoPositioningManager")
  public static void injectAutoPositioningManager(OverviewFragment instance,
      AutoPositioningManager autoPositioningManager) {
    instance.autoPositioningManager = autoPositioningManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(OverviewFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.OverviewFragment.locationDataObserver")
  public static void injectLocationDataObserver(OverviewFragment instance,
      LocationDataObserver locationDataObserver) {
    instance.locationDataObserver = locationDataObserver;
  }
}
