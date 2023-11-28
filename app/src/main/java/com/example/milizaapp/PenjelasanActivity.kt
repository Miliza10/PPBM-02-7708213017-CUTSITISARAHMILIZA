package com.example.milizaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.milizaapp.databinding.ActivityMainBinding
import com.example.milizaapp.databinding.ActivityPenjelasanBinding

class PenjelasanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPenjelasanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPenjelasanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = this.intent
        if (intent != null){
            val name = intent.getStringExtra("sayur")
            val detail = intent.getIntExtra("detail", R.string.TomatDesc)
            val image = intent.getIntExtra("image", R.drawable.pic1)

            binding.sayur.text = name
            binding.detail.setText(detail)
            binding.profilePic.setImageResource(image)
        }
    }
}