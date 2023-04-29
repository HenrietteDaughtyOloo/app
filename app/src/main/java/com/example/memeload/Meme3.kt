package com.example.memeload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Meme3 : AppCompatActivity() {
    lateinit var btn4: Button
    lateinit var tvPrevious: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        btn4 = findViewById(R.id.btnMeme4)
        tvPrevious = findViewById(R.id.tvPrevious2)
        btn4.setOnClickListener {
            val intent = Intent(this,Meme4::class.java)
            startActivity(intent)
        }
        tvPrevious.setOnClickListener {
            val intent = Intent(this,Meme2::class.java)
            startActivity(intent)
        }
    }
}