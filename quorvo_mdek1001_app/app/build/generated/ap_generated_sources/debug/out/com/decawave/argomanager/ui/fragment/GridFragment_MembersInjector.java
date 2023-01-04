package com.decawave.argomanager.ui.fragment;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.components.BlePresenceApi;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.components.ErrorManager;
import com.decawave.argomanager.components.NetworkNodeManager;
import com.decawave.argomanager.components.PositionObservationManager;
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
public final class GridFragment_MembersInjector implements MembersInjector<GridFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<DiscoveryApi> discoveryApiProvider;

  private final Provider<ErrorManager> errorManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<PositionObservationManager> positionObservationManagerProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider2;

  private final Provider<DiscoveryManager> discoveryManagerProvider;

  private final Provider<AndroidPermissionHelper> permissionHelperProvider;

  private final Provider<BlePresenceApi> presenceApiProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3;

  public GridFragment_MembersInjector(Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<PositionObservationManager> positionObservationManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider2,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BlePresenceApi> presenceApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.discoveryApiProvider = discoveryApiProvider;
    this.errorManagerProvider = errorManagerProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.positionObservationManagerProvider = positionObservationManagerProvider;
    this.networkNodeManagerProvider2 = networkNodeManagerProvider2;
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.permissionHelperProvider = permissionHelperProvider;
    this.presenceApiProvider = presenceApiProvider;
    this.appPreferenceAccessorProvider3 = appPreferenceAccessorProvider3;
  }

  public static MembersInjector<GridFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<PositionObservationManager> positionObservationManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider2,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<AndroidPermissionHelper> permissionHelperProvider,
      Provider<BlePresenceApi> presenceApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider3) {
    return new GridFragment_MembersInjector(appPreferenceAccessorProvider, discoveryApiProvider, errorManagerProvider, appPreferenceAccessorProvider2, networkNodeManagerProvider, positionObservationManagerProvider, networkNodeManagerProvider2, discoveryManagerProvider, permissionHelperProvider, presenceApiProvider, appPreferenceAccessorProvider3);
  }

  @Override
  public void injectMembers(GridFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, discoveryApiProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, errorManagerProvider.get());
    DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
    MainScreenFragment_MembersInjector.injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectPositionObservationManager(instance, positionObservationManagerProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider2.get());
    injectDiscoveryManager(instance, discoveryManagerProvider.get());
    injectPermissionHelper(instance, permissionHelperProvider.get());
    injectPresenceApi(instance, presenceApiProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider3.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.GridFragment.positionObservationManager")
  public static void injectPositionObservationManager(GridFragment instance,
      PositionObservationManager positionObservationManager) {
    instance.positionObservationManager = positionObservationManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.GridFragment.networkNodeManager")
  public static void injectNetworkNodeManager(GridFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.GridFragment.discoveryManager")
  public static void injectDiscoveryManager(GridFragment instance,
      DiscoveryManager discoveryManager) {
    instance.discoveryManager = discoveryManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.GridFragment.permissionHelper")
  public static void injectPermissionHelper(GridFragment instance,
      AndroidPermissionHelper permissionHelper) {
    instance.permissionHelper = permissionHelper;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.GridFragment.presenceApi")
  public static void injectPresenceApi(GridFragment instance, BlePresenceApi presenceApi) {
    instance.presenceApi = presenceApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.GridFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(GridFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }
}
