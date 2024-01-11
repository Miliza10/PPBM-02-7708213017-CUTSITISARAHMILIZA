package com.example.milizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {

    private lateinit var list: Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        list = findViewById(R.id.Choose)

        val d1 =findViewById<CardView>(R.id.d1)
        d1.setOnClickListener{
            val Intent = Intent (this,Pen1Activity::class.java)
            startActivity(Intent)
        }
        val d2 =findViewById<CardView>(R.id.d2)
        d2.setOnClickListener{
            val Intent = Intent (this,layouttab::class.java)
            startActivity(Intent)
        }

        val d3 =findViewById<CardView>(R.id.d3)
        d3.setOnClickListener{
            val Intent = Intent (this,DevelopActivity::class.java)
            startActivity(Intent)
        }

        val d4 =findViewById<CardView>(R.id.d4)
        d4.setOnClickListener{
            val Intent = Intent (this,RateActivity::class.java)
            startActivity(Intent)
        }

        val d5 =findViewById<CardView>(R.id.d5)
        d5.setOnClickListener{
            val Intent = Intent (this,ScrollActivity::class.java)
            startActivity(Intent)
        }
        val d6 =findViewById<CardView>(R.id.d6)
        d6.setOnClickListener{
            val Intent = Intent (this,SayurActivity::class.java)
            startActivity(Intent)
        }
    }
}