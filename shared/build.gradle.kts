plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    androidTarget()
    jvm("desktop")
    sourceSets {
        val commonMain by getting {
            dependencies {
                // TODO: Replace project reference to published one
                // implementation("com.example:testmodule:1.0.0-LOCAL-1")
                implementation(project(":testmodule"))
            }
        }
    }
}

android {
    namespace = "com.example.noncommonapiissue"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    kotlin {
        jvmToolchain(17)
    }
}
