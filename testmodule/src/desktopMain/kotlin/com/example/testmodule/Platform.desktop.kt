package com.example.testmodule

class DesktopPlatform: Platform {
    private val osName = System.getProperty("os.name")
    private val osVersion = System.getProperty("os.version")

    override val name: String = "$osName $osVersion"
}

actual fun getPlatform(): Platform = DesktopPlatform()