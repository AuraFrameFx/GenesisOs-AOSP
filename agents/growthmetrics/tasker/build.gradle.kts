plugins {
    id("genesis.android.library.hilt")
}

android {
    namespace = "dev.aurakai.auraframefx.agents.growthmetrics.tasker"
}

dependencies {
    implementation(project(":cascade:datastream:taskmanager"))
    implementation(libs.androidx.work.runtime.ktx)
}
