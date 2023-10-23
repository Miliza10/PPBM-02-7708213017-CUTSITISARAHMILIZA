package com.example.milizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DevelopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_develop)

        val bck_3 = findViewById<ImageView>(R.id.bck_3)
        bck_3.setOnClickListener {
            val Intent = Intent(this, DashboardActivity::class.java)
            startActivity(Intent)
        }
    }
}



