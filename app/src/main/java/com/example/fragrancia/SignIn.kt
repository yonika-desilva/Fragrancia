package com.example.fragrancia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        //go to home page
        findViewById<Button>(R.id.signIn).setOnClickListener {
            // Navigate to home
            val intent = Intent(this, Home::class.java)
            startActivity(intent)

        }

        //on click create account go to sign up page
        val createAccountTextView = findViewById<TextView>(R.id.createAccountButton)

        // Set an onClickListener on the TextView
        createAccountTextView.setOnClickListener {
            // Navigate to SignUp activity
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

    }
}
