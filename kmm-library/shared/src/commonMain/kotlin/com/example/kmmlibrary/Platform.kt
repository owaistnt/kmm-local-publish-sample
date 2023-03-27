package com.example.kmmlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform