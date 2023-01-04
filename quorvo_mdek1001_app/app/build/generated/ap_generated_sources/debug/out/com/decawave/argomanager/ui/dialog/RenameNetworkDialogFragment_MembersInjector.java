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
public final class RenameNetworkDialogFragment_MembersInjector implements MembersInjector<RenameNetworkDialogFragment> {
  private final Provider<NetworkNodeManager> networkNodeManagerProvider;

  public RenameNetworkDialogFragment_MembersInjector(
      Provider<NetworkNodeManager> networkNodeManagerProvider) {
    this.networkNodeManagerProvider = networkNodeManagerProvider;
  }

  public static MembersInjector<RenameNetworkDialogFragment> create(
      Provider<NetworkNodeManager> networkNodeManagerProvider) {
    return new RenameNetworkDialogFragment_MembersInjector(networkNodeManagerProvider);
  }

  @Override
  public void injectMembers(RenameNetworkDialogFragment instance) {
    injectNetworkNodeManager(instance, networkNodeManagerProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.dialog.RenameNetworkDialogFragment.networkNodeManager")
  public static void injectNetworkNodeManager(RenameNetworkDialogFragment instance,
      NetworkNodeManager networkNodeManager) {
    instance.networkNodeManager = networkNodeManager;
  }
}
