package com.decawave.argomanager.error.ui.fragment;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.components.AutoPositioningManager;
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
public final class AutoPositioningFragment_MembersInjector implements MembersInjector<AutoPositioningFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<DiscoveryApi> discoveryApiProvider;

  private final Provider<ErrorManager> errorManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  private final Provider<AutoPositioningManager> autoPositioningManagerProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<AndroidPermissionHelper> permissionHelperProvider;

  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3;

  public AutoPositioningFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<AutoPositioningManager> autoPositioningManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.discoveryApiProvider = discoveryApiProvider;
    this.errorManagerProvider = errorManagerProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
    this.autoPositioningManagerProvider = autoPositioningManagerProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.permissionHelperProvider = permissionHelperProvider;
    this.bleConnectionApiProvider = bleConnectionApiProvider;
    this.appPreferenceAccessorProvider3 = appPreferenceAccessorProvider3;
  }

  public static MembersInjector<AutoPositioningFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<AutoPositioningManager> autoPositioningManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3) {
    return new AutoPositioningFragment_MembersInjector(appPreferenceAccessorProvider, discoveryApiProvider, errorManagerProvider, appPreferenceAccessorProvider2, autoPositioningManagerProvider, networkNodeManagerProvider, permissionHelperProvider, bleConnectionApiProvider, appPreferenceAccessorProvider3);
  }

  @Override
  public void injectMembers(AutoPositioningFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, discoveryApiProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, errorManagerProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
    injectAutoPositioningManager(instance, autoPositioningManagerProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectPermissionHelper(instance, permissionHelperProvider.get());
    injectBleConnectionApi(instance, bleConnectionApiProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider3.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.AutoPositioningFragment.autoPositioningManager")
  public static void injectAutoPositioningManager(AutoPositioningFragment instance,
      AutoPositioningManager autoPositioningManager) {
    instance.autoPositioningManager = autoPositioningManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.AutoPositioningFragment.networkNodeManager")
  public static void injectNetworkNodeManager(AutoPositioningFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.AutoPositioningFragment.permissionHelper")
  public static void injectPermissionHelper(AutoPositioningFragment instance,
      AndroidPermissionHelper permissionHelper) {
    instance.permissionHelper = permissionHelper;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.AutoPositioningFragment.bleConnectionApi")
  public static void injectBleConnectionApi(AutoPositioningFragment instance,
      BleConnectionApi bleConnectionApi) {
    instance.bleConnectionApi = bleConnectionApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.AutoPositioningFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(AutoPositioningFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }
}
