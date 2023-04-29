package com.example.memeload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Meme5 : AppCompatActivity() {
    lateinit var btn5:Button
    lateinit var tvPrevious : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        btn5 = findViewById(R.id.btnMeme6)
        tvPrevious = findViewById(R.id.tvPrevious4)
        btn5.setOnClickListener {
            val intent = Intent(this,meme1::class.java)
            startActivity(intent)
        }
        tvPrevious.setOnClickListener {
            val intent = Intent(this,Meme4::class.java)
            startActivity(intent)
        }
    }
}