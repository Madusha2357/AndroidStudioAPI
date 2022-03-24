package com.example.demoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.text1)

        textview.setOnClickListener {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        }

    }
}