package com.example.milizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        val scroll = findViewById<ImageView>(R.id.scroll)
        scroll.setOnClickListener{
            val Intent = Intent (this,DashboardActivity::class.java)
            startActivity(Intent)
        }
    }
}