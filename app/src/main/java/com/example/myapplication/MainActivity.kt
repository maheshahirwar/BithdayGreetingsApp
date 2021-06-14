package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
       val name= findViewById<EditText>(R.id.userName).editableText.toString()
        val intent= Intent(this, BirthdayGreetingsActivity::class.java)
        intent.putExtra(BirthdayGreetingsActivity.NAME_EXTRA, name)
        startActivity(intent)
    }


}