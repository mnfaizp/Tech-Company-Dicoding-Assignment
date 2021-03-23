package com.dicoding.techcompany

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.techcompany.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var list: ArrayList<Company> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "10 Big Tech Company"

        binding.rvCompanies.setHasFixedSize(true)

        list.addAll(CompaniesData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        binding.rvCompanies.layoutManager = LinearLayoutManager(this)
        val cardViewCompanyAdapter = CardViewCompanyAdapter(list)
        binding.rvCompanies.adapter = cardViewCompanyAdapter

        cardViewCompanyAdapter.setOnItemClickCallback(object : CardViewCompanyAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Company) {
                showDetail(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchView = menu?.findItem(R.id.search)?.actionView as SearchView

        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.queryHint = resources.getString(R.string.search_hint)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                Toast.makeText(this@MainActivity, query, Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_me -> {
                val moveToAboutMe = Intent(this, AboutMeActivity::class.java)
                startActivity(moveToAboutMe)
                return true
            }

            R.id.announcement -> {
                Toast.makeText(this, "This is Announcement", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> return false
        }

    }

    private fun showDetail(company: Company) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_NAME, company.name)
        intent.putExtra(DetailActivity.EXTRA_DETAIL, company.description)
        intent.putExtra(DetailActivity.EXTRA_IMG, company.photo)
        startActivity(intent)
    }
}