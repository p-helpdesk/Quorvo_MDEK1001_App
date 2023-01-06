package com.decawave.argomanager.error.ui.fragment;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.components.ErrorManager;
import com.decawave.argomanager.components.NetworkNodeManager;
import com.decawave.argomanager.prefs.AppPreferenceAccessor;
import com.decawave.argomanager.util.AndroidPermissionHelper;
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
public final class DiscoveryFragment_MembersInjector implements MembersInjector<DiscoveryFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<DiscoveryApi> discoveryApiProvider;

  private final Provider<ErrorManager> errorManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  private final Provider<DiscoveryManager> discoveryManagerProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3;

  private final Provider<AndroidPermissionHelper> permissionHelperProvider;

  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  public DiscoveryFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.discoveryApiProvider = discoveryApiProvider;
    this.errorManagerProvider = errorManagerProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.appPreferenceAccessorProvider3 = appPreferenceAccessorProvider3;
    this.permissionHelperProvider = permissionHelperProvider;
    this.bleConnectionApiProvider = bleConnectionApiProvider;
  }

  public static MembersInjector<DiscoveryFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider) {
    return new DiscoveryFragment_MembersInjector(appPreferenceAccessorProvider, discoveryApiProvider, errorManagerProvider, appPreferenceAccessorProvider2, discoveryManagerProvider, networkNodeManagerProvider, appPreferenceAccessorProvider3, permissionHelperProvider, bleConnectionApiProvider);
  }

  @Override
  public void injectMembers(DiscoveryFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, discoveryApiProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, errorManagerProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
    injectDiscoveryManager(instance, discoveryManagerProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider3.get());
    injectPermissionHelper(instance, permissionHelperProvider.get());
    injectBleConnectionApi(instance, bleConnectionApiProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DiscoveryFragment.discoveryManager")
  public static void injectDiscoveryManager(DiscoveryFragment instance,
      DiscoveryManager discoveryManager) {
    instance.discoveryManager = discoveryManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DiscoveryFragment.networkNodeManager")
  public static void injectNetworkNodeManager(DiscoveryFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DiscoveryFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(DiscoveryFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DiscoveryFragment.permissionHelper")
  public static void injectPermissionHelper(DiscoveryFragment instance,
      AndroidPermissionHelper permissionHelper) {
    instance.permissionHelper = permissionHelper;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DiscoveryFragment.bleConnectionApi")
  public static void injectBleConnectionApi(DiscoveryFragment instance,
      BleConnectionApi bleConnectionApi) {
    instance.bleConnectionApi = bleConnectionApi;
  }
}
