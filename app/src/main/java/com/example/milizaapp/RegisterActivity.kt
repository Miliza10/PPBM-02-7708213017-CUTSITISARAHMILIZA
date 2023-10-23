package com.example.milizaapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val register = findViewById<Button>(R.id.register)
        register.setOnClickListener {
            val Intent = Intent(this, DashboardActivity::class.java)
            startActivity(Intent)
        }

        val reg_2 = findViewById<TextView>(R.id.reg_2)
        reg_2.setOnClickListener {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }
    }
}