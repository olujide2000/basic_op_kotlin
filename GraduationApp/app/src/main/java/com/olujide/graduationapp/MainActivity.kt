package com.olujide.graduationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSubmit = findViewById<Button>(R.id.btn_submit)
        val btnList = findViewById<Button>(R.id.btn_list)
        val etName = findViewById<EditText>(R.id.full_name)
        val etCourse = findViewById<EditText>(R.id.Course_name)

        val et_Name = etName.text.toString()
        val et_Course = etCourse.text.toString()

        btnSubmit.setOnClickListener {
            val intent = Intent(this, GraduationActivity::class.java)
            intent.putExtra("name", et_Name)
            intent.putExtra("course", et_Course)
            startActivity(intent)
        }

        btnList.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }

    }
}