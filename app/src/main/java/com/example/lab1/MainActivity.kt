package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPig = findViewById<Button>(R.id.button_pig)
        buttonPig.setOnClickListener {
            PigIntent()
        }
        val buttonDog = findViewById<Button>(R.id.button_dog)
        buttonDog.setOnClickListener {
            DogIntent()
        }
        val buttonCat = findViewById<Button>(R.id.button_cat)
        buttonCat.setOnClickListener {
            CatIntent()
        }
    }

    val Pig = Animal("Чупа", "Чуп - це маленька тваринка з великими очима.")
    val Dog = Animal("Супер", "Супер - це маленька герой з великим серцем.")
    val Cat = Animal("Кукі", "Кукі - це маленький милий кіт.")
    fun PigIntent() {
        val secActivity = Intent(this, AnimalActivity::class.java).also{
            it.putExtra("name", Pig.name)
            it.putExtra("about", Pig.about)
            startActivity(it)
        }
    }

    fun DogIntent() {
        val secActivity = Intent(this, AnimalActivity::class.java).also{
            it.putExtra("name", Dog.name)
            it.putExtra("about", Dog.about)
            startActivity(it)
        }
    }

    fun CatIntent() {
        val secActivity = Intent(this, AnimalActivity::class.java).also{
            it.putExtra("name", Cat.name)
            it.putExtra("about", Cat.about)
            startActivity(it)
        }
    }
}