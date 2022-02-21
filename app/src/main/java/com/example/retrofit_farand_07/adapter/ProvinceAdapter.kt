package com.example.retrofit_farand_07.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_farand_07.R
import com.example.retrofit_farand_07.model.ProvinceResponse

class ProvinceAdapter(private var list: ArrayList<ProvinceResponse>): RecyclerView.Adapter<ProvinceAdapter.ProvinceViewHolder>(){
    inner class ProvinceViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(province: ProvinceResponse){
            with(itemView){
                val caseName: TextView = findViewById(R.id.tvName)
                caseName.text = province.attributes.province
                val casePositive: TextView = findViewById(R.id.tvPositive)
                casePositive.text = province.attributes.positive.toString()
                val caseRecover: TextView = findViewById(R.id.tvRecover)
                caseRecover.text = province.attributes.recover.toString()
                val caseDeath: TextView = findViewById(R.id.tvDeath)
                caseDeath.text = province.attributes.death.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_province, parent, false)
        return ProvinceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProvinceViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}