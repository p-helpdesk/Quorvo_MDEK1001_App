package com.decawave.argomanager.debuglog;

import com.decawave.argomanager.components.ErrorManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class LogEntryCollectorImpl_Factory implements Factory<LogEntryCollectorImpl> {
  private final Provider<ErrorManager> errorManagerProvider;

  private final Provider<LogBlockStatus> blockStatusProvider;

  public LogEntryCollectorImpl_Factory(Provider<ErrorManager> errorManagerProvider,
      Provider<LogBlockStatus> blockStatusProvider) {
    this.errorManagerProvider = errorManagerProvider;
    this.blockStatusProvider = blockStatusProvider;
  }

  @Override
  public LogEntryCollectorImpl get() {
    return newInstance(errorManagerProvider.get(), blockStatusProvider.get());
  }

  public static LogEntryCollectorImpl_Factory create(Provider<ErrorManager> errorManagerProvider,
      Provider<LogBlockStatus> blockStatusProvider) {
    return new LogEntryCollectorImpl_Factory(errorManagerProvider, blockStatusProvider);
  }

  public static LogEntryCollectorImpl newInstance(ErrorManager errorManager,
      LogBlockStatus blockStatus) {
    return new LogEntryCollectorImpl(errorManager, blockStatus);
  }
}
