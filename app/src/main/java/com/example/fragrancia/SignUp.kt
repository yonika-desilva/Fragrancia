package com.example.fragrancia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        // Find the button by ID and set the click listener
        findViewById<Button>(R.id.signUp).setOnClickListener {
            // Navigate to onboarding2
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)

        }
    }
}