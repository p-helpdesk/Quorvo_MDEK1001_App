package com.decawave.argomanager.ui;

import com.decawave.argomanager.components.DiscoveryManager;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<DiscoveryManager> discoveryManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<AndroidPermissionHelper> permissionHelperProvider;

  public MainActivity_MembersInjector(Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<AndroidPermissionHelper> permissionHelperProvider) {
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.permissionHelperProvider = permissionHelperProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<AndroidPermissionHelper> permissionHelperProvider) {
    return new MainActivity_MembersInjector(networkNodeManagerProvider, discoveryManagerProvider, appPreferenceAccessorProvider, permissionHelperProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectDiscoveryManager(instance, discoveryManagerProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    injectPermissionHelper(instance, permissionHelperProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.MainActivity.networkNodeManager")
  public static void injectNetworkNodeManager(MainActivity instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.MainActivity.discoveryManager")
  public static void injectDiscoveryManager(MainActivity instance,
      DiscoveryManager discoveryManager) {
    instance.discoveryManager = discoveryManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.MainActivity.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(MainActivity instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.MainActivity.permissionHelper")
  public static void injectPermissionHelper(MainActivity instance,
      AndroidPermissionHelper permissionHelper) {
    instance.permissionHelper = permissionHelper;
  }
}
