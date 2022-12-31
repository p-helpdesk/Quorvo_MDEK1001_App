package com.decawave.argomanager.components.impl;

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
public final class UniqueReorderingStack_Factory<T> implements Factory<UniqueReorderingStack<T>> {
  @Override
  public UniqueReorderingStack<T> get() {
    return newInstance();
  }

  @SuppressWarnings("unchecked")
  public static <T> UniqueReorderingStack_Factory<T> create() {
    return InstanceHolder.INSTANCE;
  }

  public static <T> UniqueReorderingStack<T> newInstance() {
    return new UniqueReorderingStack<T>();
  }

  private static final class InstanceHolder {
    @SuppressWarnings("rawtypes")
    private static final UniqueReorderingStack_Factory INSTANCE = new UniqueReorderingStack_Factory();
  }
}
