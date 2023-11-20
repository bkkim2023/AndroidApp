package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickbuttons = findViewById<Button>(R.id.button1)
        val textviews = findViewById<TextView>(R.id.textview1)

        clickbuttons.setOnClickListener {
            textviews.text = "click success!!"
        }
    }
}