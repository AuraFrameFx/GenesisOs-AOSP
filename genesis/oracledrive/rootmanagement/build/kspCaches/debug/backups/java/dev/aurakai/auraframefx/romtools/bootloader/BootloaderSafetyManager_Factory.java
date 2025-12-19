package dev.aurakai.auraframefx.romtools.bootloader;

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
public final class BootloaderSafetyManager_Factory implements Factory<BootloaderSafetyManager> {
  private final Provider<Context> contextProvider;

  private BootloaderSafetyManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public BootloaderSafetyManager get() {
    return newInstance(contextProvider.get());
  }

  public static BootloaderSafetyManager_Factory create(Provider<Context> contextProvider) {
    return new BootloaderSafetyManager_Factory(contextProvider);
  }

  public static BootloaderSafetyManager newInstance(Context context) {
    return new BootloaderSafetyManager(context);
  }
}
