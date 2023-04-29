package com.example.memeload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Meme4 : AppCompatActivity() {
    lateinit var btn5:Button
    lateinit var tvPrevious:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        btn5 = findViewById(R.id.btnMeme5)
        tvPrevious = findViewById(R.id.tvPrevious3)
        btn5.setOnClickListener {
            val intent = Intent(this,Meme5::class.java)
            startActivity(intent)
        }
        tvPrevious.setOnClickListener {
            val intent = Intent(this,Meme3::class.java)
            startActivity(intent)
        }
    }
}