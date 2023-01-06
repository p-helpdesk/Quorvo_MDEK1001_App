package com.decawave.argomanager.error.ui.fragment;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.components.ErrorManager;
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
public final class DiscoveryProgressAwareFragment_MembersInjector implements MembersInjector<DiscoveryProgressAwareFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<DiscoveryApi> discoveryApiProvider;

  private final Provider<ErrorManager> errorManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  public DiscoveryProgressAwareFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.discoveryApiProvider = discoveryApiProvider;
    this.errorManagerProvider = errorManagerProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
  }

  public static MembersInjector<DiscoveryProgressAwareFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<DiscoveryApi> discoveryApiProvider, Provider<ErrorManager> errorManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2) {
    return new DiscoveryProgressAwareFragment_MembersInjector(appPreferenceAccessorProvider, discoveryApiProvider, errorManagerProvider, appPreferenceAccessorProvider2);
  }

  @Override
  public void injectMembers(DiscoveryProgressAwareFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    injectDiscoveryApi(instance, discoveryApiProvider.get());
    injectErrorManager(instance, errorManagerProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DiscoveryProgressAwareFragment.discoveryApi")
  public static void injectDiscoveryApi(DiscoveryProgressAwareFragment instance,
      DiscoveryApi discoveryApi) {
    instance.discoveryApi = discoveryApi;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DiscoveryProgressAwareFragment.errorManager")
  public static void injectErrorManager(DiscoveryProgressAwareFragment instance,
      ErrorManager errorManager) {
    instance.errorManager = errorManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.DiscoveryProgressAwareFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(DiscoveryProgressAwareFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }
}
