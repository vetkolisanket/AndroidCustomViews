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

        init()
    }

    fun init() {
//        bvBadgeView.setProfilePic("http://images2.fanpop.com/image/photos/8800000/Scarlett-Johansson-scarlett-johansson-8836765-500-375.jpg")
//            .setBadge("https://previews.123rf.com/images/alexutemov/alexutemov1512/alexutemov151200347/49462014-modern-flat-design-badge-icon-vector-badges-flat-modern-style-vintage-retro-flat-badges-labels-and-r.jpg")
    }

}
