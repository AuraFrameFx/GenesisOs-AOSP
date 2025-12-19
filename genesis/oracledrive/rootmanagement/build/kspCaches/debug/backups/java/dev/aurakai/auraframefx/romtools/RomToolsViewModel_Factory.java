package dev.aurakai.auraframefx.romtools;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class RomToolsViewModel_Factory implements Factory<RomToolsViewModel> {
  private final Provider<RomToolsManager> romToolsManagerProvider;

  private RomToolsViewModel_Factory(Provider<RomToolsManager> romToolsManagerProvider) {
    this.romToolsManagerProvider = romToolsManagerProvider;
  }

  @Override
  public RomToolsViewModel get() {
    return newInstance(romToolsManagerProvider.get());
  }

  public static RomToolsViewModel_Factory create(
      Provider<RomToolsManager> romToolsManagerProvider) {
    return new RomToolsViewModel_Factory(romToolsManagerProvider);
  }

  public static RomToolsViewModel newInstance(RomToolsManager romToolsManager) {
    return new RomToolsViewModel(romToolsManager);
  }
}
