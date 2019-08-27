package com.sanket.androidcustomviews

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sanket.androidcustomviews.stack_image_view.StackImageActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        btnStackImageView.setOnClickListener { startActivity(StackImageActivity.newIntent(this)) }
    }

}
