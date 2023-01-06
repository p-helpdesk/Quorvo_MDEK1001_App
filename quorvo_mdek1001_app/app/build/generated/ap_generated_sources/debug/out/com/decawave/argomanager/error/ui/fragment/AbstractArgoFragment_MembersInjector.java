package com.decawave.argomanager.error.ui.fragment;

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
public final class AbstractArgoFragment_MembersInjector implements MembersInjector<AbstractArgoFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  public AbstractArgoFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
  }

  public static MembersInjector<AbstractArgoFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    return new AbstractArgoFragment_MembersInjector(appPreferenceAccessorProvider);
  }

  @Override
  public void injectMembers(AbstractArgoFragment instance) {
    injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.AbstractArgoFragment.appPreferenceAccessor")
  public static void injectAppPreferenceAccessor(AbstractArgoFragment instance,
      AppPreferenceAccessor appPreferenceAccessor) {
    instance.appPreferenceAccessor = appPreferenceAccessor;
  }
}
