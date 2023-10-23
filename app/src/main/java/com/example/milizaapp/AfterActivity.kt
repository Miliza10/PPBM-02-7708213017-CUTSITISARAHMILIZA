package com.example.milizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AfterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after)


        val login1 = findViewById<Button>(R.id.login1)
        login1.setOnClickListener{
            val Intent = Intent(this,LoginActivity::class.java )
            startActivity(Intent)

        }

        val register1 = findViewById<Button>(R.id.register1)
        register1.setOnClickListener{
            val Intent = Intent (this,RegisterActivity::class.java)
            startActivity(Intent)
        }
    }
}