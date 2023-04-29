package com.example.memeload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnViewmeme: View
    lateinit var tvLast : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnViewmeme=findViewById(R.id.btnViewmeme)
        tvLast = findViewById(R.id.tvLast)
        btnViewmeme.setOnClickListener {
            val intent = Intent(this,meme1::class.java)
            startActivity(intent)

        }
        tvLast.setOnClickListener {
            val intent = Intent(this,Meme5::class.java)
            startActivity(intent)
        }

    }
}