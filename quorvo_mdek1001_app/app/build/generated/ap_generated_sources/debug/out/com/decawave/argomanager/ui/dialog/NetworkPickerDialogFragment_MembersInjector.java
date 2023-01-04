package com.decawave.argomanager.ui.dialog;

import com.decawave.argomanager.components.NetworkNodeManager;
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
public final class NetworkPickerDialogFragment_MembersInjector implements MembersInjector<NetworkPickerDialogFragment> {
  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  public NetworkPickerDialogFragment_MembersInjector(
      Provider<NetworkNodeManager> networkNodeManagerProvider) {
    this.networkNodeManagerProvider = networkNodeManagerProvider;
  }

  public static MembersInjector<NetworkPickerDialogFragment> create(
      Provider<NetworkNodeManager> networkNodeManagerProvider) {
    return new NetworkPickerDialogFragment_MembersInjector(networkNodeManagerProvider);
  }

  @Override
  public void injectMembers(NetworkPickerDialogFragment instance) {
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.dialog.NetworkPickerDialogFragment.networkNodeManager")
  public static void injectNetworkNodeManager(NetworkPickerDialogFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }
}
