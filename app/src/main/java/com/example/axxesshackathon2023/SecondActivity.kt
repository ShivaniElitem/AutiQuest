package com.example.axxesshackathon2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {

    private lateinit var imageone : ImageView
    private lateinit var imagetwo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        imageone = findViewById(R.id.bigdog)
        imagetwo = findViewById(R.id.smalldog)

        imageone.setOnClickListener{
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        imagetwo.setOnClickListener{
            startActivity(Intent(this, ThirdActivity::class.java))
        }

    }
}