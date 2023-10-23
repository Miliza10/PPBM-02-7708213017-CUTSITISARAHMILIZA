package com.example.milizaapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Rate
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class RateActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate)

        val ratingBar = findViewById<RatingBar>(R.id.Ratingbar)
        val button = findViewById<Button>(R.id.Ratebutton)




        val Ratebutton = findViewById<Button>(R.id.Ratebutton)
        Ratebutton.setOnClickListener {
            val Intent = Intent(this, DashboardActivity::class.java)
            startActivity(Intent)
        }

        val bck_1 = findViewById<ImageView>(R.id.bck_1)
        bck_1.setOnClickListener {
            val Intent = Intent(this, DashboardActivity::class.java)
            startActivity(Intent)
        }
    }
}