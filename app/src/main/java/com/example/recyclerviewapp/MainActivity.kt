package com.example.recyclerviewapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val names = listOf("Aman", "Riya", "Saumya", "Neha")

        val adapter = NameAdapter(names) { clickedName ->
            Toast.makeText(this, "You clicked $clickedName", Toast.LENGTH_SHORT).show()
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}