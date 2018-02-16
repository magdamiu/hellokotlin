package com.magdamiu.hellokotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_media_item.view.*

/**
 * Created by magda on 16/02/2018.
 */


class MediaItem(val title: String, val url: String)

interface Listener{
    fun onClick(mediaItem: MediaItem)
}

class MediaAdapter(val items: List<MediaItem>) : RecyclerView.Adapter<MediaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.view_media_item)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title = itemView.media_title
        private val thumb = itemView.media_thumb

        fun bind(mediaItem: MediaItem) {
            title.setText(mediaItem.title)
            thumb.loadUrl(mediaItem.url)
        }
    }
}