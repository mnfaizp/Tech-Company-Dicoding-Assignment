package com.dicoding.techcompany

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveToAboutMe = Intent(this, AboutMeActivity::class.java)
        startActivity(moveToAboutMe)
        return super.onOptionsItemSelected(item)
    }
}