plugins {
    kotlin("android")
    id("com.android.application")
}

android {
    namespace = "com.example.noncommonapiissue.android"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    kotlin {
        jvmToolchain(17)
    }
}

dependencies {
    implementation(project(":shared"))
}