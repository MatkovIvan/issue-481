package com.example.testmodule

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform