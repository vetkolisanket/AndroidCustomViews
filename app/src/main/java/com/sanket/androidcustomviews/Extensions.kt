package com.sanket.androidcustomviews

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by Sanket on 2019-09-11.
 */


fun Context.dpToPx(dp: Float) = dp * this.resources.displayMetrics.density

fun ImageView.load(url: String) = Glide.with(this)
    .load(url)
//    .placeholder(R.mipmap.ic_launcher)
//    .error(R.drawable.ic_more_icon)
    .into(this)

fun ImageView.load(drawable: Drawable) = Glide.with(this)
    .load(drawable)
//    .placeholder(R.mipmap.ic_launcher)
//    .error(R.drawable.ic_more_icon)
    .into(this)