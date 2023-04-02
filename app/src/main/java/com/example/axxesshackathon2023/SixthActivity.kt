package com.example.axxesshackathon2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SixthActivity : AppCompatActivity() {

    private lateinit var homelogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        homelogo = findViewById(R.id.page6image2)
        val backbutton = findViewById<Button>(R.id.page6button1)


        homelogo.setOnClickListener{
            startActivity(Intent(this, FourthActivity::class.java))
        }

        backbutton.setOnClickListener{
            startActivity(Intent(this, FifthActivity::class.java))
        }
    }
}