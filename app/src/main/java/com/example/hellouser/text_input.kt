package com.example.hellouser

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class text_input : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_text_input)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>( R.id.chat_button)
            .setOnClickListener {
                Toast.makeText(this, "Chat", Toast.LENGTH_SHORT).show()
            }
        findViewById<Button>( R.id.enter_button)
            .setOnClickListener {
                val input = findViewById<EditText>(R.id.editTextText)
                Toast.makeText(this, "input: ${input.text}", Toast.LENGTH_SHORT).show()
            }

    }
}