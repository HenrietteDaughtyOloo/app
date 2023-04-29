package com.example.memeload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme1 : AppCompatActivity() {
    lateinit var btn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme1)
        btn2 = findViewById(R.id.btnMeme2)
        btn2.setOnClickListener {
            val intent = Intent(this,Meme3::class.java)
            startActivity(intent)
        }
    }
}