package collabcanvas.ui;

import collabcanvas.CanvasWebSocketService;
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
public final class CanvasViewModel_Factory implements Factory<CanvasViewModel> {
  private final Provider<CanvasWebSocketService> webSocketServiceProvider;

  private CanvasViewModel_Factory(Provider<CanvasWebSocketService> webSocketServiceProvider) {
    this.webSocketServiceProvider = webSocketServiceProvider;
  }

  @Override
  public CanvasViewModel get() {
    return newInstance(webSocketServiceProvider.get());
  }

  public static CanvasViewModel_Factory create(
      Provider<CanvasWebSocketService> webSocketServiceProvider) {
    return new CanvasViewModel_Factory(webSocketServiceProvider);
  }

  public static CanvasViewModel newInstance(CanvasWebSocketService webSocketService) {
    return new CanvasViewModel(webSocketService);
  }
}
