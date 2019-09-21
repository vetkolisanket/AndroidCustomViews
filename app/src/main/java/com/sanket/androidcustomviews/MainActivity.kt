package com.sanket.androidcustomviews

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sanket.androidcustomviews.circular_image_view.CircularImageActivity
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
    }

}
