package com.example.milizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener{
            val Intent = Intent(this,DashboardActivity::class.java )
            startActivity(Intent)

        }

        val reg_1 = findViewById<TextView>(R.id.reg_1)
        reg_1.setOnClickListener{
            val Intent = Intent(this,RegisterActivity::class.java )
            startActivity(Intent)

        }
    }
}