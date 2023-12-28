package com.example.kmppoc

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun greetRik(): String {
        return "Hello, Rik!"
    }
}