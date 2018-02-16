package com.magdamiu.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        recycler.adapter = MediaAdapter(getMediaFromCode())

        recycler.setOnClickListener { view ->
            view.setOnClickListener(null)
        }

        //or

        recycler.setOnClickListener {
            it.setOnClickListener(null)
        }

        //or

        recycler.setOnClickListener {
            toast("Recycler is clicked :D")
        }
    }
}
