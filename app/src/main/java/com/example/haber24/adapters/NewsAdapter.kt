package com.example.haber24.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.haber24.R
import com.example.haber24.model.Datum
import com.example.haber24.model.ItemList
import com.example.haber24.model.NewsModel
import com.example.haber24.ui.NewsDetail


class NewsAdapter(private var spots: ArrayList<ItemList>)
    : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(
            inflater.inflate(
                R.layout.item_news,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val spot = spots[position]

        Glide.with(holder.photo.context)
            .load(spot.imageUrl)
            .transform(CenterCrop(), RoundedCorners(20))
            .into(holder.photo)

       holder.text.text= spot.shortText

      holder.photo.setOnClickListener {
      val i = Intent(it.context,NewsDetail::class.java)
      i.putExtra("news",position.toString())
      it.context.startActivity(i)

  }

    }

    override fun getItemCount(): Int {
        return spots.size
    }
    fun setSpots(spots: ArrayList<ItemList>) {
        this.spots = spots
    }
    fun getSpots(): ArrayList<ItemList> {
        return spots }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var photo : ImageView = view.findViewById(R.id.imageNews)
        var text : TextView = view.findViewById(R.id.shorttextNews)


    }

}