package com.example.ktgt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ktgt.databinding.ActivityMainBinding
import com.example.ktgt.databinding.ListBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var binding1: ListBinding
    companion object {
        val namephone = mutableListOf<data>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerview = binding.recyclerview
        recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        val adapter = dapter(namephone)
        recyclerview.adapter = adapter
        binding.ADD.setOnClickListener {
            val intent = Intent(this@MainActivity, add::class.java)
            startActivity(intent)
        }
    }
    override fun onResume() {
        super.onResume()
        binding.recyclerview.adapter?.notifyDataSetChanged()
    }
}
