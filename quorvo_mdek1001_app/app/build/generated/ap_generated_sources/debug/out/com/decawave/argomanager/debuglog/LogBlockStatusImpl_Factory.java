package com.decawave.argomanager.debuglog;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

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
public final class LogBlockStatusImpl_Factory implements Factory<LogBlockStatusImpl> {
  @Override
  public LogBlockStatusImpl get() {
    return newInstance();
  }

  public static LogBlockStatusImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LogBlockStatusImpl newInstance() {
    return new LogBlockStatusImpl();
  }

  private static final class InstanceHolder {
    private static final LogBlockStatusImpl_Factory INSTANCE = new LogBlockStatusImpl_Factory();
  }
}
