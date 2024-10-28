package com.example.appklinik

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
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
    private lateinit var txtBack : TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doctor_page)

        txtBack = findViewById(R.id.txtBack)

        txtBack.setOnClickListener(){
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        val rvMenu : RecyclerView = findViewById(R.id.RvMenu)
        rvMenu.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        val menuList = listOf(
            ModelIcon(R.drawable.iconheart,"Cardiologyst"),
            ModelIcon(R.drawable.iconeye,"Opthalmologyst"),
            ModelIcon(R.drawable.icontooth,"Dentist"),
            ModelIcon(R.drawable.iconheart,"Cardiologyst"),
            ModelIcon(R.drawable.pasien,"Patient"),
            ModelIcon(R.drawable.male,"Male"),

            )
        rvMenu.adapter = AdapterMenuIcon(menuList)

        val rvDoctor : RecyclerView = findViewById(R.id.RvDoctor)
        rvDoctor.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val doctorList = listOf(
            ModelListDokter("Dr. Floyd Miles", R.drawable.dokterr1,"Pediatrics", "(123 reviews)", "5.0", "23 Oct 2024", "09.00pm"),
            ModelListDokter("Dr. Guy Hawkinds", R.drawable.dokterr5,"Dentist", "(100 reviews)", "4.9", "07 May 2024", "09.45am"),
            ModelListDokter("Dr. Jane Cooper", R.drawable.dokterr2,"Physician", "(102 reviews)", "4.8", "02 Feb 2024", "10.15am"),
            ModelListDokter("Dr. Jacob Jones", R.drawable.dokterr8,"Nephrologyst", "(101 reviews)", "5.0", "09 June 2024", "7.30pm"),
            ModelListDokter("Dr. Neil Amstrong", R.drawable.dokterr9,"Obstetrician", "(99 reviews)", "4.9","01 Jan 2024", "06.00am")
        )
        rvDoctor.adapter = AdapterDokterIcon(this,doctorList)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}