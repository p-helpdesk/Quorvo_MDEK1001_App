package com.decawave.argomanager.ui.fragment;

import com.decawave.argomanager.components.AutoPositioningManager;
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
public final class ApPreviewFragment_MembersInjector implements MembersInjector<ApPreviewFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  private final Provider<AutoPositioningManager> autoPositioningManagerProvider;

  public ApPreviewFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<AutoPositioningManager> autoPositioningManagerProvider) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
    this.autoPositioningManagerProvider = autoPositioningManagerProvider;
  }

  public static MembersInjector<ApPreviewFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2,
      Provider<AutoPositioningManager> autoPositioningManagerProvider) {
    return new ApPreviewFragment_MembersInjector(appPreferenceAccessorProvider, networkNodeManagerProvider, appPreferenceAccessorProvider2, autoPositioningManagerProvider);
  }

  @Override
  public void injectMembers(ApPreviewFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
    injectAutoPositioningManager(instance, autoPositioningManagerProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.ApPreviewFragment.networkNodeManager")
  public static void injectNetworkNodeManager(ApPreviewFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.ApPreviewFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(ApPreviewFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.ApPreviewFragment.autoPositioningManager")
  public static void injectAutoPositioningManager(ApPreviewFragment instance,
      AutoPositioningManager autoPositioningManager) {
    instance.autoPositioningManager = autoPositioningManager;
  }
}
