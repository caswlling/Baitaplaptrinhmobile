package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvMessage: TextView
    private lateinit var btnSayHi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMessage = findViewById(R.id.tvMessage)
        btnSayHi = findViewById(R.id.btnSayHi)

        btnSayHi.setOnClickListener {
            tvMessage.text = "Le Minh Tan"
        }
    }
}