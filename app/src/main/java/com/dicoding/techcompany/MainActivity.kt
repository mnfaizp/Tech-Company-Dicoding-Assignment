package com.dicoding.techcompany

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCompanies: RecyclerView
    private var list: ArrayList<Company> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "10 Big Tech Company"

        rvCompanies = findViewById(R.id.rv_companies)
        rvCompanies.setHasFixedSize(true)

        list.addAll(CompaniesData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvCompanies.layoutManager = LinearLayoutManager(this)
        val cardViewCompanyAdapter = CardViewCompanyAdapter(list)
        rvCompanies.adapter = cardViewCompanyAdapter
    }
}