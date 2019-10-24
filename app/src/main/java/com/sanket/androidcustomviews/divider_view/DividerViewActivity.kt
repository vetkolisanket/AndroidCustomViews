package com.sanket.androidcustomviews.divider_view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sanket.androidcustomviews.R

class DividerViewActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, DividerViewActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_divider_view)
    }
}
