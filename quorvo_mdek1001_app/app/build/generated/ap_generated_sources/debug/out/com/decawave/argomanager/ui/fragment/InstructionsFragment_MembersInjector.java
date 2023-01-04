package com.decawave.argomanager.ui.fragment;

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
public final class InstructionsFragment_MembersInjector implements MembersInjector<InstructionsFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2;

  public InstructionsFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.appPreferenceAccessorProvider2 = appPreferenceAccessorProvider2;
  }

  public static MembersInjector<InstructionsFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider2) {
    return new InstructionsFragment_MembersInjector(appPreferenceAccessorProvider, appPreferenceAccessorProvider2);
  }

  @Override
  public void injectMembers(InstructionsFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider2.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.ui.fragment.InstructionsFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(InstructionsFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }
}
