package com.ira.rickmortyapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform