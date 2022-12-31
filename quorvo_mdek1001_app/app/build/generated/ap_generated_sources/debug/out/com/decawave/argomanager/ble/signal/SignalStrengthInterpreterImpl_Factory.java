package com.decawave.argomanager.ble.signal;

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
public final class SignalStrengthInterpreterImpl_Factory implements Factory<SignalStrengthInterpreterImpl> {
  @Override
  public SignalStrengthInterpreterImpl get() {
    return newInstance();
  }

  public static SignalStrengthInterpreterImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SignalStrengthInterpreterImpl newInstance() {
    return new SignalStrengthInterpreterImpl();
  }

  private static final class InstanceHolder {
    private static final SignalStrengthInterpreterImpl_Factory INSTANCE = new SignalStrengthInterpreterImpl_Factory();
  }
}
