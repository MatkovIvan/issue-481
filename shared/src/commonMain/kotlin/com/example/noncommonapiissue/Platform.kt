package com.example.noncommonapiissue

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform