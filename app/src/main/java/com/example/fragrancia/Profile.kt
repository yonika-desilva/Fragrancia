package com.example.fragrancia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Find the button by ID and set the click listener
        findViewById<Button>(R.id.reviewsButton).setOnClickListener {
            // Navigate to onboarding2
            val intent = Intent(this, CommunityReviews::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }



        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.profile -> {
                    // Handle Profile item selection
                    true
                }
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



                else -> false
            }
        }

    }
}