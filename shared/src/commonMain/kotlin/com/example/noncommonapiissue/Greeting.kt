package com.example.noncommonapiissue

import com.example.testmodule.Platform
import com.example.testmodule.getPlatform

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}