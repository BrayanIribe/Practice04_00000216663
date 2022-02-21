package com.example.practica04_00000216663

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold:Button = findViewById(R.id.button_cold_drinks)
        var btnHot:Button = findViewById(R.id.button_hot_drinks)
        var btnSweets:Button = findViewById(R.id.button_sweets)
        var btnSalties: Button = findViewById(R.id.button_salties)

        btnCold.setOnClickListener {
            var intent: Intent = Intent(this, ProductsPage::class.java).apply {
                putExtra("kind","cold")
            }
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            var intent: Intent = Intent(this, ProductsPage::class.java).apply{
                putExtra("kind","hot")
            }
            startActivity(intent)
        }
        btnSweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductsPage::class.java).apply{
                putExtra("kind","sweets")
            }
            startActivity(intent)
        }
        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this, ProductsPage::class.java).apply{
                putExtra("kind","salties")
            }
            startActivity(intent)
        }
    }
}