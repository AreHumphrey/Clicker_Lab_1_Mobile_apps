package com.example.lab_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var clickCount = 0
    private lateinit var clickText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        clickText = findViewById(R.id.click)

        val incrementButton = findViewById<Button>(R.id.button1)
        incrementButton.setOnClickListener { incrementClickCount() }

        val decrementButton = findViewById<Button>(R.id.button2)
        decrementButton.setOnClickListener { decrementClickCount() }
    }

    private fun incrementClickCount() {
        clickCount++
        clickText.text = clickCount.toString()
    }

    private fun decrementClickCount() {
            clickCount--
            clickText.text = clickCount.toString()
    }
}
