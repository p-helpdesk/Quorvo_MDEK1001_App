package com.decawave.argomanager.prefs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppPreferenceAccessorImpl_Factory implements Factory<AppPreferenceAccessorImpl> {
  @Override
  public AppPreferenceAccessorImpl get() {
    return newInstance();
  }

  public static AppPreferenceAccessorImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppPreferenceAccessorImpl newInstance() {
    return new AppPreferenceAccessorImpl();
  }

  private static final class InstanceHolder {
    private static final AppPreferenceAccessorImpl_Factory INSTANCE = new AppPreferenceAccessorImpl_Factory();
  }
}
