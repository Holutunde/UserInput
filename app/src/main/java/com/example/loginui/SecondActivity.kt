package com.example.loginui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val UserMessage = findViewById<TextView>(R.id.UserMessage)

        val bundle: Bundle? = intent.extras
        bundle?.let{
            val msg = bundle.getString(USERNAME)

            UserMessage.text = "My  username is ${msg}"
        }
    }
}