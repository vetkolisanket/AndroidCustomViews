package com.sanket.androidcustomviews.badge_view

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.sanket.androidcustomviews.R
import com.sanket.androidcustomviews.load
import kotlinx.android.synthetic.main.view_badge.view.*

/**
 * Created by Sanket on 2019-10-14.
 */
class BadgeView: ConstraintLayout {

    private var profilePicDrawable: Drawable? = null
    private var badgeDrawable: Drawable? = null

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        val attributes = context!!.obtainStyledAttributes(attrs, R.styleable.BadgeView, 0, 0)
        profilePicDrawable = attributes.getDrawable(R.styleable.BadgeView_profile_pic_drawable)
        badgeDrawable = attributes.getDrawable(R.styleable.BadgeView_badge_drawable)

        profilePicDrawable?.let {
            ivProfilePic.load(it)
        }
        badgeDrawable?.let {
            ivBadge.load(it)
        }
    }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        initializeViews()
    }

    private fun initializeViews() {
        val inflater = context.getSystemService(Context
            .LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.view_badge, this)
//        layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)//this is needed, i don't understand why though
    }

    fun setProfilePic(url: String): BadgeView {
        ivProfilePic.load(url)
        return this
    }

    fun setBadge(url: String): BadgeView {
        ivBadge.load(url)
        return this
    }

}