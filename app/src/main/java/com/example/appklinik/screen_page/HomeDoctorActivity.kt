package com.example.appklinik.screen_page

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appklinik.R
import com.example.appklinik.model.ModelIcon
import com.example.appklinik.model.ModelListDokter
import com.nashwa.klinikapps.adapter.AdapterDokterIcon
import com.nashwa.klinikapps.adapter.AdapterMenuIcon




class HomeDoctorActivity : AppCompatActivity() {

    private lateinit var rv_list_doctor : RecyclerView
    private var homeDoctorAdapter : AdapterDokterIcon? = null
    private lateinit var  menuItem :RecyclerView
    private var MenudoctorAdapter : AdapterMenuIcon? = null
    //array data doctor
    private var doctorlist = mutableListOf<ModelListDokter>()
    private var itemMenuList = mutableListOf<ModelIcon>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_doctor)

        rv_list_doctor = findViewById(R.id.rv_list_doctor)
        menuItem = findViewById(R.id.RvMenu)
        itemMenuList = ArrayList()
        doctorlist = ArrayList()
        homeDoctorAdapter = AdapterDokterIcon(this, doctorlist)
        MenudoctorAdapter = AdapterMenuIcon(itemMenuList)



        var layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,1)
        rv_list_doctor!!.layoutManager = layoutManager
        rv_list_doctor!!.adapter = homeDoctorAdapter

        var layoutManager2 : RecyclerView.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        menuItem!!.layoutManager = layoutManager2
        menuItem!!.adapter = MenudoctorAdapter
        //bikin data dumy
        prepareDataDoctors()
        prepareDataMenu()



    }

    private fun prepareDataMenu() {
        var itemMenu = ModelIcon (
            R.drawable.iconheart,
            "Heart",



            )
        itemMenuList.add(itemMenu)

        itemMenu = ModelIcon (
            R.drawable.icontooth,
            "Dentis"


        )
        itemMenuList.add(itemMenu)

        itemMenu = ModelIcon (
            R.drawable.iconeye,
            "Epilogi"


        )
        itemMenuList.add(itemMenu)
        MenudoctorAdapter!!.notifyDataSetChanged()




    }

    private fun prepareDataDoctors() {
        var itemDoctor = ModelListDokter (
            "Nashwa Harzathi",
            R.drawable.dokter1,
            "Dentist",
            "100",
            "5.0",
            "23 Nov 2024",
            "4.00pm"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListDokter (
            "Haura",
            R.drawable.dokter2,
            "Ahli beda",
            "98",
            "5.0",
            "20 Oct 2024",
            "6.00am"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListDokter (
            "Rahmiatul husna",
            R.drawable.dokter3,
            "Ahli gizi",
            "90",
            "4.0",
            "01 marc 2024",
            "8.00am"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListDokter (
            "Desfanni zulya",
            R.drawable.dokter4,
            "Dokter umum",
            "99",
            "4.9",
            "07 augst 2024",
            "10.00am"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListDokter (
            "Mutia",
            R.drawable.dokter5,
            "Dokter gigi",
            "97",
            "4.8",
            "18 feb 2024",
            "12.00am"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListDokter (
            "Hanifah",
            R.drawable.dokter6,
            "Dokter kandungan",
            "99",
            "4.9",
            "09 may 2024",
            "09.30am"

        )
        doctorlist.add(itemDoctor)


        homeDoctorAdapter!!.notifyDataSetChanged()






    }
}