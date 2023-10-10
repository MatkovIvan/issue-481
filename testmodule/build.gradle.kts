plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("maven-publish")
}

kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }
    jvm("desktop")

    sourceSets {
        val commonMain by getting {
        }
        val androidMain by getting {
        }
        val desktopMain by getting {
        }
    }
}

android {
    namespace = "com.example.testmodule"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    kotlin {
        jvmToolchain(17)
    }
}

group = "com.example"
version = "1.0.0-LOCAL-1"
