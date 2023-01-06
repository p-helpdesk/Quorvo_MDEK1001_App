package com.decawave.argomanager.error.ui.dialog;

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
public final class TurnOnLocationServiceDialogFragment_MembersInjector implements MembersInjector<TurnOnLocationServiceDialogFragment> {
  private final Provider<AndroidPermissionHelper> permissionHelperProvider;

  public TurnOnLocationServiceDialogFragment_MembersInjector(
      Provider<AndroidPermissionHelper> permissionHelperProvider) {
    this.permissionHelperProvider = permissionHelperProvider;
  }

  public static MembersInjector<TurnOnLocationServiceDialogFragment> create(
      Provider<AndroidPermissionHelper> permissionHelperProvider) {
    return new TurnOnLocationServiceDialogFragment_MembersInjector(permissionHelperProvider);
  }

  @Override
  public void injectMembers(TurnOnLocationServiceDialogFragment instance) {
    injectPermissionHelper(instance, permissionHelperProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.dialog.TurnOnLocationServiceDialogFragment.permissionHelper")
  public static void injectPermissionHelper(TurnOnLocationServiceDialogFragment instance,
      AndroidPermissionHelper permissionHelper) {
    instance.permissionHelper = permissionHelper;
  }
}
