package dev.aurakai.auraframefx.romtools;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.aurakai.auraframefx.romtools.bootloader.BootloaderManager;
import dev.aurakai.auraframefx.romtools.retention.AurakaiRetentionManager;
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
public final class RomToolsManager_Factory implements Factory<RomToolsManager> {
  private final Provider<BootloaderManager> bootloaderManagerProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private final Provider<SystemModificationManager> systemModificationManagerProvider;

  private final Provider<FlashManager> flashManagerProvider;

  private final Provider<RomVerificationManager> verificationManagerProvider;

  private final Provider<BackupManager> backupManagerProvider;

  private final Provider<AurakaiRetentionManager> retentionManagerProvider;

  private RomToolsManager_Factory(Provider<BootloaderManager> bootloaderManagerProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<SystemModificationManager> systemModificationManagerProvider,
      Provider<FlashManager> flashManagerProvider,
      Provider<RomVerificationManager> verificationManagerProvider,
      Provider<BackupManager> backupManagerProvider,
      Provider<AurakaiRetentionManager> retentionManagerProvider) {
    this.bootloaderManagerProvider = bootloaderManagerProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.systemModificationManagerProvider = systemModificationManagerProvider;
    this.flashManagerProvider = flashManagerProvider;
    this.verificationManagerProvider = verificationManagerProvider;
    this.backupManagerProvider = backupManagerProvider;
    this.retentionManagerProvider = retentionManagerProvider;
  }

  @Override
  public RomToolsManager get() {
    return newInstance(bootloaderManagerProvider.get(), recoveryManagerProvider.get(), systemModificationManagerProvider.get(), flashManagerProvider.get(), verificationManagerProvider.get(), backupManagerProvider.get(), retentionManagerProvider.get());
  }

  public static RomToolsManager_Factory create(
      Provider<BootloaderManager> bootloaderManagerProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<SystemModificationManager> systemModificationManagerProvider,
      Provider<FlashManager> flashManagerProvider,
      Provider<RomVerificationManager> verificationManagerProvider,
      Provider<BackupManager> backupManagerProvider,
      Provider<AurakaiRetentionManager> retentionManagerProvider) {
    return new RomToolsManager_Factory(bootloaderManagerProvider, recoveryManagerProvider, systemModificationManagerProvider, flashManagerProvider, verificationManagerProvider, backupManagerProvider, retentionManagerProvider);
  }

  public static RomToolsManager newInstance(BootloaderManager bootloaderManager,
      RecoveryManager recoveryManager, SystemModificationManager systemModificationManager,
      FlashManager flashManager, RomVerificationManager verificationManager,
      BackupManager backupManager, AurakaiRetentionManager retentionManager) {
    return new RomToolsManager(bootloaderManager, recoveryManager, systemModificationManager, flashManager, verificationManager, backupManager, retentionManager);
  }
}
