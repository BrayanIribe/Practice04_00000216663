package com.example.practica04_00000216663

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.practica04_00000216663.R.id.btnGetStarted

class RegisterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        val button: Button = findViewById(R.id.button_sign_in) as Button
        button.setOnClickListener {
            var intent:Intent = Intent(this, MenuPage::class.java)
            startActivity(intent)
        }
    }
}