package com.sanket.androidcustomviews.facebook_like_emotions

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanket.androidcustomviews.R

class FLEActivity : AppCompatActivity() {

    companion object {

        fun newIntent(context: Context) = Intent(context, FLEActivity::class.java)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fle)
    }
}
