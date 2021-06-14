package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingsActivity : AppCompatActivity() {
     companion object{
         val NAME_EXTRA ="name_extra"
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greetings)
        val name = intent.getStringExtra("name_extra")
        findViewById<TextView>(R.id.birthdayGreetings).text="Happy Birthday My Dear\n$name"
    }
}