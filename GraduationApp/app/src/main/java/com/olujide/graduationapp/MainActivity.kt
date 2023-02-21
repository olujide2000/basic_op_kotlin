package com.olujide.graduationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

        btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            val course = etCourse.text.toString()
            val intent = Intent(this, GraduationActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Course", course)
            startActivity(intent)
        }

        btnList.setOnClickListener {
            //startActivity(Intent(this, ListActivity::class.java))
            val name = etName.text.toString()
            val course = etCourse.text.toString()
            val intent = Intent(this, ListActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Course", course)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.grad_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.ic_list -> startActivity(Intent(this, ListActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}