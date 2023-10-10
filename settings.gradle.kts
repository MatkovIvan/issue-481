rootProject.name = "Non_Common_API_Issue"

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

include(":testmodule")
include(":shared")

include(":androidApp")
include(":desktopApp")