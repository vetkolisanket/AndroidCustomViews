package com.sanket.androidcustomviews.mmt_view_pager

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
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
        vpChild.adapter = MMTPagerAdapter(supportFragmentManager)
//        vpParent.setPageTransformer(MarginPageTransformer(50))
        vpChild.clipToPadding = false
        vpChild.setPadding(96, 0, 96, 0)
        vpChild.pageMargin = 48
        vpChild.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                vpParent.setCurrentItem(position, true)
            }

        })
    }

}
