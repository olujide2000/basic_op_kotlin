package com.olujide.graduationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSubmit = findViewById<Button>(R.id.btn_submit)
        val btnList = findViewById<Button>(R.id.btn_list)

        btnSubmit.setOnClickListener {
            startActivity(Intent(this, GraduationActivity::class.java))
        }

        btnList.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }

    }
}