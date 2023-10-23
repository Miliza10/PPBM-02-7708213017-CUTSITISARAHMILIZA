package com.example.milizaapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Pen1Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pen1)

        val bck_4 = findViewById<ImageView>(R.id.bck_4)
        bck_4.setOnClickListener {
            val Intent = Intent(this, DashboardActivity::class.java)
            startActivity(Intent)
        }
    }
}