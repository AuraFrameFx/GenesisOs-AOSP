package dev.aurakai.auraframefx.romtools.retention;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AurakaiRetentionManagerImpl_Factory implements Factory<AurakaiRetentionManagerImpl> {
  private final Provider<Context> contextProvider;

  private AurakaiRetentionManagerImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AurakaiRetentionManagerImpl get() {
    return newInstance(contextProvider.get());
  }

  public static AurakaiRetentionManagerImpl_Factory create(Provider<Context> contextProvider) {
    return new AurakaiRetentionManagerImpl_Factory(contextProvider);
  }

  public static AurakaiRetentionManagerImpl newInstance(Context context) {
    return new AurakaiRetentionManagerImpl(context);
  }
}
