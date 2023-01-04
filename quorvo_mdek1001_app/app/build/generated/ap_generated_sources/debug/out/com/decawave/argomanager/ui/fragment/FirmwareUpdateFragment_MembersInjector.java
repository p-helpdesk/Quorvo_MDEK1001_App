package com.decawave.argomanager.ui.fragment;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.components.BlePresenceApi;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.components.ErrorManager;
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
public final class FirmwareUpdateFragment_MembersInjector implements MembersInjector<FirmwareUpdateFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<DiscoveryApi> discoveryApiProvider;

  private final Provider<ErrorManager> errorManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  private final Provider<DiscoveryManager> discoveryManagerProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<AndroidPermissionHelper> permissionHelperProvider;

  private final Provider<BlePresenceApi> presenceApiProvider;

  private final Provider<NetworkNodePropertyDecorator> propertyDecoratorProvider;

  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  public FirmwareUpdateFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BlePresenceApi> presenceApiProvider,
      Provider<NetworkNodePropertyDecorator> propertyDecoratorProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.discoveryApiProvider = discoveryApiProvider;
    this.errorManagerProvider = errorManagerProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.permissionHelperProvider = permissionHelperProvider;
    this.presenceApiProvider = presenceApiProvider;
    this.propertyDecoratorProvider = propertyDecoratorProvider;
    this.bleConnectionApiProvider = bleConnectionApiProvider;
  }

  public static MembersInjector<FirmwareUpdateFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BlePresenceApi> presenceApiProvider,
      Provider<NetworkNodePropertyDecorator> propertyDecoratorProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider) {
    return new FirmwareUpdateFragment_MembersInjector(appPreferenceAccessorProvider, discoveryApiProvider, errorManagerProvider, appPreferenceAccessorProvider2, discoveryManagerProvider, networkNodeManagerProvider, permissionHelperProvider, presenceApiProvider, propertyDecoratorProvider, bleConnectionApiProvider);
  }

  @Override
  public void injectMembers(FirmwareUpdateFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, discoveryApiProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, errorManagerProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
    injectDiscoveryManager(instance, discoveryManagerProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectPermissionHelper(instance, permissionHelperProvider.get());
    injectPresenceApi(instance, presenceApiProvider.get());
    injectPropertyDecorator(instance, propertyDecoratorProvider.get());
    injectBleConnectionApi(instance, bleConnectionApiProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.FirmwareUpdateFragment.discoveryManager")
  public static void injectDiscoveryManager(FirmwareUpdateFragment instance,
      DiscoveryManager discoveryManager) {
    instance.discoveryManager = discoveryManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.FirmwareUpdateFragment.networkNodeManager")
  public static void injectNetworkNodeManager(FirmwareUpdateFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.FirmwareUpdateFragment.permissionHelper")
  public static void injectPermissionHelper(FirmwareUpdateFragment instance,
      AndroidPermissionHelper permissionHelper) {
    instance.permissionHelper = permissionHelper;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.FirmwareUpdateFragment.presenceApi")
  public static void injectPresenceApi(FirmwareUpdateFragment instance,
      BlePresenceApi presenceApi) {
    instance.presenceApi = presenceApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.FirmwareUpdateFragment.propertyDecorator")
  public static void injectPropertyDecorator(FirmwareUpdateFragment instance,
      NetworkNodePropertyDecorator propertyDecorator) {
    instance.propertyDecorator = propertyDecorator;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.FirmwareUpdateFragment.bleConnectionApi")
  public static void injectBleConnectionApi(FirmwareUpdateFragment instance,
      BleConnectionApi bleConnectionApi) {
    instance.bleConnectionApi = bleConnectionApi;
  }
}
