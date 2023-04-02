package com.example.axxesshackathon2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ThirdActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val button = findViewById<Button>(R.id.myButton)

        button.setOnClickListener{
            startActivity(Intent(this, FourthActivity::class.java))
        }

    }
}