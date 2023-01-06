package com.decawave.argomanager.error.ui.fragment;

import com.decawave.argomanager.debuglog.LogEntryCollector;
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
public final class LogBufferFragment_MembersInjector implements MembersInjector<LogBufferFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  private final Provider<LogEntryCollector> logEntryCollectorProvider;

  public LogBufferFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<LogEntryCollector> logEntryCollectorProvider) {
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
    this.logEntryCollectorProvider = logEntryCollectorProvider;
  }

  public static MembersInjector<LogBufferFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider,
      Provider<LogEntryCollector> logEntryCollectorProvider) {
    return new LogBufferFragment_MembersInjector(appPreferenceAccessorProvider, logEntryCollectorProvider);
  }

  @Override
  public void injectMembers(LogBufferFragment instance) {
    AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorProvider.get());
    injectLogEntryCollector(instance, logEntryCollectorProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.error.ui.fragment.LogBufferFragment.logEntryCollector")
  public static void injectLogEntryCollector(LogBufferFragment instance,
      LogEntryCollector logEntryCollector) {
    instance.logEntryCollector = logEntryCollector;
  }
}
