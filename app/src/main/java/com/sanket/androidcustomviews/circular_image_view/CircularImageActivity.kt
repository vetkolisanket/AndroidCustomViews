package com.sanket.androidcustomviews.circular_image_view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sanket.androidcustomviews.R

class CircularImageActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, CircularImageActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_image)
    }
}
