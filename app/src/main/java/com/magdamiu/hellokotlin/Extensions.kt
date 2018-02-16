package com.magdamiu.hellokotlin

import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by magda on 16/02/2018.
 */

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun ViewGroup.inflate(@LayoutRes resource: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(this.context).inflate(resource, this, attachToRoot)
}

fun ImageView.loadUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}