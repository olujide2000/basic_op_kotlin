package com.olujide.graduationapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GraduationActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graduation)

        val txtName =  findViewById<TextView>(R.id.tx_full_name)
        val txtCourse = findViewById<TextView>(R.id.tx_course_name)

        val intent = intent


        val txName = intent.getStringExtra("Name")
        val txCourse = intent.getStringExtra("Course")


        txtName.text = "Name: $txName"
        txtCourse.text = "Course: $txCourse"

    }
}