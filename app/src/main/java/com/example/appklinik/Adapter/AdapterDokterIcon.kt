package com.nashwa.klinikapps.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appklinik.R
import com.example.appklinik.model.ModelListDokter


class AdapterDokterIcon (
    val itemDoctorList: List<ModelListDokter>) :
    RecyclerView.Adapter<AdapterDokterIcon.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgDoctor: ImageView = itemView.findViewById(R.id.imgDoctor2)
        val nameDoctor: TextView = itemView.findViewById(R.id.nameDoctor)
        val bidangDoctor: TextView = itemView.findViewById(R.id.bidangDoctor)
        val totalReview: TextView = itemView.findViewById(R.id.totalReview)
        val angkaReview: TextView = itemView.findViewById(R.id.angkaReview)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dokter, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int
    {
        return itemDoctorList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemDoctorList[position]
        holder.imgDoctor.setImageResource(currentItem.ImageDr)
        holder.nameDoctor.setText(currentItem.NamaDr)
        holder.bidangDoctor.setText(currentItem.BidangDr)
        holder.totalReview.setText(currentItem.TotalReview)
        holder.angkaReview.setText(currentItem.AngkaReview)

    }




}