package com.example.fragrancia

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {


                R.id.home -> {
                    // Handle Home item selection
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    true
                }

                R.id.Community -> {
                    // Handle Catalogue item selection
                    val intent = Intent(this, Catalogue::class.java)
                    startActivity(intent)
                    true
                }

                R.id.discover -> {
                    val intent = Intent(this, Trends::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    // Handle Profile item selection
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                    true
                }


                else -> false
            }
        }

    }
}