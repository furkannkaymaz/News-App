package com.example.haber24.ui

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.ddtech.ddverifier.managers.Globals
import com.example.haber24.adapters.NewsAdapter
import com.example.haber24.adapters.NewsAdapterH
import com.example.haber24.databinding.ActivityMainBinding
import com.example.rocketapp.managers.ServiceManager


class MainActivity : AppCompatActivity() {

    val LINK = "https://turkmedya-live.ercdn.net/tv24/tv24.m3u8"
    val video: Uri = Uri.parse(LINK)


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        live()
        getNews()

    }

    fun getNews(){
        ServiceManager().getNews(
            {
                var news = it.data[0].itemList

                binding.newsRecyvview.layoutManager = LinearLayoutManager(
                    this,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
                binding.newsRecyvview.adapter = NewsAdapter(news)

                val pagerSnapHelper = PagerSnapHelper()
                pagerSnapHelper.attachToRecyclerView(binding.newsRecyvview)

                binding.newsRecyvviewHorizontel.layoutManager = LinearLayoutManager(
                    this,
                    LinearLayoutManager.VERTICAL,
                    false
                )
                binding.newsRecyvviewHorizontel.adapter = NewsAdapterH(news)
                pagerSnapHelper.attachToRecyclerView(binding.newsRecyvviewHorizontel)

            },
            {
            }
        )

        ServiceManager().getNewsDetail(
            {

            },
            {
            }
        )
    }
    fun live(){

         binding.videoLive.setVideoURI(video)
         binding.videoLive.start()
        if(Globals.shared.sound == 1 ) {
            binding.soundOff.setOnClickListener {
                val audioManager = this.getSystemService(Context.AUDIO_SERVICE) as AudioManager
                audioManager.setStreamMute(AudioManager.STREAM_MUSIC, true)
                binding.soundOff.visibility = View.GONE
                binding.soundon.visibility = View.VISIBLE
                binding.soundon.setOnClickListener {
                    audioManager.setStreamMute(AudioManager.STREAM_MUSIC, false)
                    binding.soundOff.visibility = View.VISIBLE
                    binding.soundon.visibility = View.GONE

                }
            }
        }
        binding.videoLive.setOnClickListener {
            if (Globals.shared.videostatus == false){

                binding.mediaController.visibility = View.VISIBLE

                binding.pause.setOnClickListener {

                    binding.videoLive.stopPlayback()
                    binding.pause.visibility = View.GONE
                    binding.start.visibility = View.VISIBLE



                    binding.start.setOnClickListener {
                        binding.videoLive.setVideoURI(video)
                        binding.videoLive.start()
                        binding.mediaController.visibility = View.GONE
                        binding.pause.visibility = View.VISIBLE
                        binding.start.visibility = View.GONE

                    }
                }
            }

        }
    }
    override fun onResume() {
        super.onResume()
        binding.videoLive.start()
    }

}