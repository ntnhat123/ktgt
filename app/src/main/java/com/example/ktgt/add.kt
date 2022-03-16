package com.example.ktgt
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ktgt.databinding.AddBinding

class add : AppCompatActivity() {
    private lateinit var binding: AddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.add.setOnClickListener {
            val name = binding.name.text.toString()
            val phone = binding.phone.text.toString()
            val namephone = data(name, phone)
            MainActivity.namephone.add(namephone)
            finish()
        }
    }
}
