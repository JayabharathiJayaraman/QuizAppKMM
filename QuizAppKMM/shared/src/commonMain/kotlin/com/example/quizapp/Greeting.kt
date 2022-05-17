package com.example.quizapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}