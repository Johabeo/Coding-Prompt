package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ui.adapter.StudentAdapter
import com.example.myapplication.ui.viewmodel.StudentViewModel

private lateinit var vm : StudentViewModel
private lateinit var adapter : StudentAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = List<StudentViewModel>

        // This loop will create 20 Views containing
        // the image with the count of vie

        // This will pass the ArrayList to our Adapter

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}