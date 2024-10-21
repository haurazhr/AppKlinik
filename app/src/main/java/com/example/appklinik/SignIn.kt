package com.example.appklinik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        val seeDetailsTextView: TextView = findViewById(R.id.textView7)
        seeDetailsTextView.setOnClickListener {
            // Pindah ke DetailActivity
            val intent = Intent(this,PageRegister::class.java)
            startActivity(intent)
        }

        val btndokter: TextView = findViewById(R.id.btndokter)
        btndokter.setOnClickListener(){
            val intent = Intent(this, DoctorPage::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}