package com.example.appklinik

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.appklinik.model.ModelIcon
import com.example.appklinik.model.ModelListDokter
import com.nashwa.klinikapps.adapter.AdapterDokterIcon
import com.nashwa.klinikapps.adapter.AdapterMenuIcon


class DoctorPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doctor_page)

        val rvMenu : RecyclerView = findViewById(R.id.RvMenu)
        rvMenu.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        val menuList = listOf(
            ModelIcon(R.drawable.iconheart,"Cardiologyst"),
            ModelIcon(R.drawable.iconeye,"Opthalmologyst"),
            ModelIcon(R.drawable.icontooth,"Dentist"),

            )
        rvMenu.adapter = AdapterMenuIcon(menuList)

        val rvDoctor : RecyclerView = findViewById(R.id.RvDoctor)
        rvDoctor.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val doctorList = listOf(
            ModelListDokter("Dr. Floyd Miles", R.drawable.dokterr1,"Pediatrics", "(123 reviews)", "4.9"),
            ModelListDokter("Dr. Guy Hawkinds", R.drawable.dokterr5,"Dentist", "(85 reviews)", "4.9"),
            ModelListDokter("Dr. Jane Cooper", R.drawable.dokterr2,"Pediatrics", "(44 reviews)", "4.8"),
            ModelListDokter("Dr. Jacob Jones", R.drawable.dokterr6,"Nephrologyst", "(101 reviews)", "5.0")
        )
        rvDoctor.adapter =  AdapterDokterIcon(doctorList)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}