package com.example.axxesshackathon2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SeventhActivity : AppCompatActivity() {

    private lateinit var homelogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh)

        homelogo = findViewById(R.id.page7image5)
        val submitbutton = findViewById<Button>(R.id.page7button1)


        homelogo.setOnClickListener{
            startActivity(Intent(this, FourthActivity::class.java))
        }

        submitbutton.setOnClickListener{
            startActivity(Intent(this, FourthActivity::class.java))
        }
    }
}