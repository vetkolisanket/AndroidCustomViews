package com.sanket.androidcustomviews.badge_view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sanket.androidcustomviews.R

class BadgeViewActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, BadgeViewActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_badge_view)
    }
}
