package com.sanket.androidcustomviews.mmt_view_pager

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        vpParent.adapter = MMTPagerAdapter(supportFragmentManager)
//        vpParent.setPageTransformer(MarginPageTransformer(50))
        vpParent.clipToPadding = false
        vpParent.setPadding(48, 0, 48, 0)
        vpParent.pageMargin = 24
    }

}
