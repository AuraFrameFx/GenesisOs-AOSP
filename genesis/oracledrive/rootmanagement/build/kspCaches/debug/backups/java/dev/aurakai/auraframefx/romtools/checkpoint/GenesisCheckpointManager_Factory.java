package dev.aurakai.auraframefx.romtools.checkpoint;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class GenesisCheckpointManager_Factory implements Factory<GenesisCheckpointManager> {
  private final Provider<Context> contextProvider;

  private GenesisCheckpointManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public GenesisCheckpointManager get() {
    return newInstance(contextProvider.get());
  }

  public static GenesisCheckpointManager_Factory create(Provider<Context> contextProvider) {
    return new GenesisCheckpointManager_Factory(contextProvider);
  }

  public static GenesisCheckpointManager newInstance(Context context) {
    return new GenesisCheckpointManager(context);
  }
}
