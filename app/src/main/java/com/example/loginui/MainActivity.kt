package com.example.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = findViewById<TextView>(R.id.nameText)
        val passkey = findViewById<TextView>(R.id.passwordText)
        val button = findViewById<Button>(R.id.signBtn)

      button.setOnClickListener{
            val user = userName.text.toString()
            val key = passkey.text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra(USERNAME,user)
            intent.putExtra(passWord, key)
             startActivity(intent)

        }
    }

}