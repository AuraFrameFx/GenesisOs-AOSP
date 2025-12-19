package dev.aurakai.auraframefx.datavein.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class DataVeinSphereGridViewModel_Factory implements Factory<DataVeinSphereGridViewModel> {
  @Override
  public DataVeinSphereGridViewModel get() {
    return newInstance();
  }

  public static DataVeinSphereGridViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DataVeinSphereGridViewModel newInstance() {
    return new DataVeinSphereGridViewModel();
  }

  private static final class InstanceHolder {
    static final DataVeinSphereGridViewModel_Factory INSTANCE = new DataVeinSphereGridViewModel_Factory();
  }
}
