package com.sanket.androidcustomviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sanket.androidcustomviews.badge_view.BadgeViewActivity
import com.sanket.androidcustomviews.circular_image_view.CircularImageActivity
import com.sanket.androidcustomviews.divider_view.DividerViewActivity
import com.sanket.androidcustomviews.facebook_like_emotions.FLEActivity
import com.sanket.androidcustomviews.mmt_view_pager.MMTViewPagerActivity
import com.sanket.androidcustomviews.poll_view.PollViewActivity
import com.sanket.androidcustomviews.square_image_view.SquareImageActivity
import com.sanket.androidcustomviews.stack_image_view.StackImageActivity
import com.sanket.androidcustomviews.stack_text_view.StackTextActivity
import com.sanket.androidcustomviews.timeline_view.TimelineViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        btnCircularImage.setOnClickListener { startActivity(CircularImageActivity.newIntent(this)) }
        btnStackImageView.setOnClickListener { startActivity(StackImageActivity.newIntent(this)) }
        btnStackTextView.setOnClickListener { startActivity(StackTextActivity.newIntent(this)) }
        btnTimelineView.setOnClickListener { startActivity(TimelineViewActivity.newIntent(this)) }
        btnBadgeView.setOnClickListener { startActivity(BadgeViewActivity.newIntent(this)) }
        btnPollView.setOnClickListener { startActivity(PollViewActivity.newIntent(this)) }
        btnSquareImage.setOnClickListener { startActivity(SquareImageActivity.newIntent(this)) }
        btnDividerView.setOnClickListener { startActivity(DividerViewActivity.newIntent(this)) }
        btnMMTViewPager.setOnClickListener { startActivity(MMTViewPagerActivity.newIntent(this)) }
        btnFLE.setOnClickListener { startActivity(FLEActivity.newIntent(this)) }
    }

}