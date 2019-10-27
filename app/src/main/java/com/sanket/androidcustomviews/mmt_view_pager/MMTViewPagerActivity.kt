package com.sanket.androidcustomviews.mmt_view_pager

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.MarginPageTransformer
import com.sanket.androidcustomviews.R
import kotlinx.android.synthetic.main.activity_mmtview_pager.*

class MMTViewPagerActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, MMTViewPagerActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mmtview_pager)

        initViews()
    }

    private fun initViews() {
        vpParent.adapter = MMTViewPagerAdapter()
        vpParent.setPageTransformer(MarginPageTransformer(50))
    }

}
