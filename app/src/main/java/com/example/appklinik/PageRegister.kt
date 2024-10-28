package com.example.appklinik

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appklinik.screen_page.HomeDoctorActivity

class PageRegister : AppCompatActivity() {
    private lateinit var signUp : TextView
    private lateinit var btnRegis : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_register)
        signUp = findViewById(R.id.TxtAccount)
        btnRegis = findViewById(R.id.buttonsignup)

        signUp.setOnClickListener(){
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
        btnRegis.setOnClickListener(){
            val intent = Intent(this, HomeDoctorActivity::class.java)
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}