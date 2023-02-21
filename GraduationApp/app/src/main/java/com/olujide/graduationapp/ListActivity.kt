package com.olujide.graduationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val gradlist = findViewById<ListView>(R.id.grd_list)
        val intent = intent
        val txName1 = intent.getStringExtra("Name")
        val txCourse1 = intent.getStringExtra("Course")
        val graduationList = arrayListOf("$txName1", "$txCourse1")
            //graduationList.add(1, "$txName1")
            //graduationList.add(1, "$txCourse1")

        //val graduationList = arrayListOf<String>(
           // "Tim Owenz",
           // "Olujide Alabi",
           // "John Samson",
           // "Abidemi Stephen",
           // "Victor Kisaka",
           // "Tim Owenz",
            //"Olujide Alabi",
           // "John Samson",
           // "Abidemi Stephen",
           // "Victor Kisaka"
        //)
        val gradAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, graduationList)
        gradlist.adapter = gradAdapter

    }
    // menu inflators
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // menu selectors
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.ic_home -> startActivity(Intent(this, MainActivity::class.java))
            R.id.ic_upload -> startActivity(Intent(this, GraduationActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}