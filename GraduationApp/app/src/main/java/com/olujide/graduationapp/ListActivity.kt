package com.olujide.graduationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val grad_list = findViewById<ListView>(R.id.grd_list)
        val graduationList = arrayListOf<String>(
            "Tim Owenz",
            "Olujide Alabi",
            "John Samson",
            "Abidemi Stephen",
            "Victor Kisaka",
            "Tim Owenz",
            "Olujide Alabi",
            "John Samson",
            "Abidemi Stephen",
            "Victor Kisaka"
        )
        val gradAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, graduationList)
        grad_list.adapter = gradAdapter
    }
}