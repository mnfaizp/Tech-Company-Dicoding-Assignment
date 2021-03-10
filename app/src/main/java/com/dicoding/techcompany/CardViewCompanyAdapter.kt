package com.dicoding.techcompany

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewCompanyAdapter(private val listCompany: ArrayList<Company>) : RecyclerView.Adapter<CardViewCompanyAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_logo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_companies, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val company = listCompany[position]

        Glide.with(holder.itemView.context)
                .load(company.photo)
                .apply(RequestOptions().override(350,350))
                .into(holder.imgPhoto)

        holder.tvName.text = company.name
        holder.tvDesc.text = company.description

    }

    override fun getItemCount(): Int {
        return  listCompany.size
    }
}