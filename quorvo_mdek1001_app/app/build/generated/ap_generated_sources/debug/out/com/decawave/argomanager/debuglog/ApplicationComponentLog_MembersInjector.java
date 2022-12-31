package com.decawave.argomanager.debuglog;

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
public final class ApplicationComponentLog_MembersInjector implements MembersInjector<ApplicationComponentLog> {
  private final Provider<LogEntryCollector> logCollectorProvider;

  public ApplicationComponentLog_MembersInjector(Provider<LogEntryCollector> logCollectorProvider) {
    this.logCollectorProvider = logCollectorProvider;
  }

  public static MembersInjector<ApplicationComponentLog> create(
      Provider<LogEntryCollector> logCollectorProvider) {
    return new ApplicationComponentLog_MembersInjector(logCollectorProvider);
  }

  @Override
  public void injectMembers(ApplicationComponentLog instance) {
    injectLogCollector(instance, logCollectorProvider.get());
  }

  @InjectedFieldSignature("com.decawave.argomanager.debuglog.ApplicationComponentLog.logCollector")
  public static void injectLogCollector(ApplicationComponentLog instance,
      LogEntryCollector logCollector) {
    instance.logCollector = logCollector;
  }
}
