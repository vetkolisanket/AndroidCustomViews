package com.sanket.androidcustomviews.facebook_like_emotions

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sanket.androidcustomviews.R
import kotlinx.android.synthetic.main.activity_fle.*

class FLEActivity : AppCompatActivity() {

    companion object {

        fun newIntent(context: Context) = Intent(context, FLEActivity::class.java)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fle)

        init()
    }

    private fun init() {
        ibEmotion.setOnLongClickListener {
            emotions.visibility = View.VISIBLE
            true
        }
    }
}
