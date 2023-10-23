package com.example.milizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Pen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pen2)

        val bck_2 = findViewById<ImageView>(R.id.bck_2)
        bck_2.setOnClickListener {
            val Intent = Intent(this, DashboardActivity::class.java)
            startActivity(Intent)
        }
    }
}