plugins {
    id("genesis.android.library.hilt")
}

android {
    namespace = "dev.aurakai.auraframefx.kai.sentinelsfortress.threatmonitor"
}

dependencies {
    implementation(project(":kai:sentinelsfortress:security"))
    implementation(libs.libsu.core)
}
