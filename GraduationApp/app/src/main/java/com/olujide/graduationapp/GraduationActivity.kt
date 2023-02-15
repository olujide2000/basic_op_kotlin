package com.olujide.graduationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GraduationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graduation)

        val txtName =  findViewById<TextView>(R.id.txt_full_name)
        val txtCourse = findViewById<TextView>(R.id.txt_course_name)

        val tv_Name = intent.getStringExtra("name")
        val tv_Course = intent.getStringExtra("course")

        txtName.setText(tv_Name)
        txtCourse.setText(tv_Course)
    }
}