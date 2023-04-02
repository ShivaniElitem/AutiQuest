package com.example.axxesshackathon2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FourthActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        textView = findViewById(R.id.text1)

        textView.setOnClickListener{
            startActivity(Intent(this, FifthActivity::class.java))
        }

    }
}