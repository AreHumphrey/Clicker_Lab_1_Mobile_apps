package com.example.lab_11

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var clickCount = 0
    private lateinit var clickText: TextView
    private lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        clickText = findViewById(R.id.click)

        val incrementButton = findViewById<Button>(R.id.button1)
        incrementButton.setOnClickListener { incrementClickCount() }

        val decrementButton = findViewById<Button>(R.id.button2)
        decrementButton.setOnClickListener { decrementClickCount() }

        var buttonEngine: Button = findViewById(R.id.languageButton_en)

        var buttonRus: Button = findViewById(R.id.languageButton_ru)

        var massageView: TextView = findViewById(R.id.textView)

        buttonEngine.setOnClickListener{
            context = LocaleHelper.setLocale(this, "en")
            massageView.text = context.getString(R.string.press)
        }

        buttonRus.setOnClickListener{
            context = LocaleHelper.setLocale(this, "ru")
            massageView.text = context.getString(R.string.press)
        }

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
