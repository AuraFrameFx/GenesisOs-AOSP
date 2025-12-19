plugins {
    id("genesis.android.library.hilt")
}

android {
    namespace = "dev.aurakai.auraframefx.agents.growthmetrics.progression"
}

dependencies {
    implementation(project(":agents:growthmetrics:metareflection"))
    implementation(project(":agents:growthmetrics:spheregrid"))
}
