package com.example.fragrancia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<ImageButton>(R.id.lavenderButton).setOnClickListener {

            val intent = Intent(this, Lavender::class.java)
            startActivity(intent)
        }


        findViewById<ImageButton>(R.id.citrusButton).setOnClickListener {

            val intent = Intent(this, Citrus::class.java)
            startActivity(intent)
        }



        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        //bottom navigation
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Handle Home item selection
                    true
                }

                R.id.Community -> {
                    // Handle Catalogue item selection
                    val intent = Intent(this,Catalogue::class.java)
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