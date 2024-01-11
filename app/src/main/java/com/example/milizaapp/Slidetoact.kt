package com.example.milizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ncorti.slidetoact.SlideToActView

class Slidetoact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slidetoact)

        val splashScreen: SlideToActView = findViewById<SlideToActView>(R.id.slideToAct)


        splashScreen.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener{
            override fun onSlideComplete(view: SlideToActView) {
                val intent = Intent(this@Slidetoact, AfterActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
    }
