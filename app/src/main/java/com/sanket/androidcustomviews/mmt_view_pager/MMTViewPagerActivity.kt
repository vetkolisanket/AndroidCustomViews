package com.sanket.androidcustomviews.mmt_view_pager

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sanket.androidcustomviews.R

class MMTViewPagerActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, MMTViewPagerActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mmtview_pager)
    }
}
