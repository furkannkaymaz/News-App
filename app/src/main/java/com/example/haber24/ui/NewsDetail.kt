package com.example.haber24.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.ddtech.ddverifier.managers.Globals
import com.example.haber24.R
import com.example.haber24.databinding.ActivityMainBinding
import com.example.haber24.databinding.ActivityNewsDetailBinding
import com.example.rocketapp.managers.ServiceManager

class NewsDetail : AppCompatActivity() {

    private lateinit var binding: ActivityNewsDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        intent.getStringExtra("news")

        newsDetails()


    }

    fun newsDetails(){


        Glide.with(this)
            .load(R.drawable.no_image)
            // haber detay ekranından gelen resimlerde sıkıntı olduğu için burada bu resmi koydum
            // .load(Globals.shared.selectedNews?.data?.newsDetail?.imageURL) olması gereken
            .into(binding.newsImage)

        binding.tvDetails.text = Globals.shared.selectedNews?.data?.newsDetail?.bodyText
    }
}