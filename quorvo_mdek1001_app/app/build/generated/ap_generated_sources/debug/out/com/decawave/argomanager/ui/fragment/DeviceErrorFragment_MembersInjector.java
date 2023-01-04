package com.decawave.argomanager.ui.fragment;

import com.decawave.argomanager.components.ErrorManager;
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
public final class DeviceErrorFragment_MembersInjector implements MembersInjector<DeviceErrorFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<ErrorManager> errorManagerProvider;

  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  public DeviceErrorFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<ErrorManager> errorManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.errorManagerProvider = errorManagerProvider;
    this.networkNodeManagerProvider = networkNodeManagerProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
  }

  public static MembersInjector<DeviceErrorFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<ErrorManager> errorManagerProvider,
      Provider<NetworkNodeManager> networkNodeManagerProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2) {
    return new DeviceErrorFragment_MembersInjector(appPreferenceAccessorProvider, errorManagerProvider, networkNodeManagerProvider, appPreferenceAccessorProvider2);
  }

  @Override
  public void injectMembers(DeviceErrorFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    injectErrorManager(instance, errorManagerProvider.get());
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.DeviceErrorFragment.errorManager")
  public static void injectErrorManager(DeviceErrorFragment instance, ErrorManager errorManager) {
    instance.errorManager = errorManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.DeviceErrorFragment.networkNodeManager")
  public static void injectNetworkNodeManager(DeviceErrorFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.DeviceErrorFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(DeviceErrorFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }
}
