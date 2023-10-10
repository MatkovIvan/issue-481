package com.example.noncommonapiissue

import com.example.testmodule.Platform
import com.example.testmodule.getPlatform

class Greeting {
    // TODO: Try to use DesktopPlatform class directly from here.
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}