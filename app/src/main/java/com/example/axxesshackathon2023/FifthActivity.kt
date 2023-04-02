package com.example.axxesshackathon2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class FifthActivity : AppCompatActivity() {

    private lateinit var homelogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        homelogo = findViewById(R.id.page5image3)
        val parentbutton = findViewById<Button>(R.id.page5button1)
        val childbutton = findViewById<Button>(R.id.page5button2)

        homelogo.setOnClickListener{
            startActivity(Intent(this, FourthActivity::class.java))
        }

        parentbutton.setOnClickListener{
            startActivity(Intent(this, SixthActivity::class.java))
        }

        childbutton.setOnClickListener{
            startActivity(Intent(this, SeventhActivity::class.java))
        }

    }
}