package com.example.quizapp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity(R.layout.activity_main)
