package com.dicoding.techcompany

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMG = "extra_img"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNameReceived: TextView = findViewById(R.id.tv_name_received)
        val tvDetailReceived: TextView = findViewById(R.id.tv_detail_received)
        val imgReceived: ImageView = findViewById(R.id.image_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val image = intent.getIntExtra(EXTRA_IMG, 0)

        tvNameReceived.text = name
        tvDetailReceived.text = detail

        Glide.with(imgReceived)
                .load(image)
                .apply(RequestOptions().override(350,350))
                .into(imgReceived)

    }
}