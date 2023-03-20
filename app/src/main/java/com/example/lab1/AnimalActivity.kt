package com.example.lab1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.Dispatchers.Main


class AnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        showInfo()
    }

    fun showInfo()
    {
        val name = intent.getStringExtra("name")
        val about = intent.getStringExtra("about")
        val showName = findViewById<TextView>(R.id.textName).apply {
            text = name
        }
        val showAbout = findViewById<TextView>(R.id.textAbout).apply {
            text = about
        }
    }
}