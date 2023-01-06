package com.decawave.argomanager.error.ui.fragment;

import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.components.NetworkNodeManager;
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
public final class NodeDetailFragment_MembersInjector implements MembersInjector<NodeDetailFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<DiscoveryManager> discoveryManagerProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<BleConnectionApi> bleConnectionApiProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  public NodeDetailFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.bleConnectionApiProvider = bleConnectionApiProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
  }

  public static MembersInjector<NodeDetailFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryManager> discoveryManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<BleConnectionApi> bleConnectionApiProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2) {
    return new NodeDetailFragment_MembersInjector(appPreferenceAccessorProvider, discoveryManagerProvider, networkNodeManagerProvider, bleConnectionApiProvider, appPreferenceAccessorProvider2);
  }

  @Override
  public void injectMembers(NodeDetailFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    injectDiscoveryManager(instance, discoveryManagerProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectBleConnectionApi(instance, bleConnectionApiProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.NodeDetailFragment.discoveryManager")
  public static void injectDiscoveryManager(NodeDetailFragment instance,
      DiscoveryManager discoveryManager) {
    instance.discoveryManager = discoveryManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.NodeDetailFragment.networkNodeManager")
  public static void injectNetworkNodeManager(NodeDetailFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.NodeDetailFragment.bleConnectionApi")
  public static void injectBleConnectionApi(NodeDetailFragment instance,
      BleConnectionApi bleConnectionApi) {
    instance.bleConnectionApi = bleConnectionApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.NodeDetailFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(NodeDetailFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }
}
