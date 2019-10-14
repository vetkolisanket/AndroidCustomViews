package com.sanket.androidcustomviews.square_image_view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sanket.androidcustomviews.R

class SquareImageActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, SquareImageActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_image_view)
    }
}
