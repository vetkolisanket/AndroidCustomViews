package com.sanket.androidcustomviews.badge_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.sanket.androidcustomviews.R

/**
 * Created by Sanket on 2019-10-14.
 */
class BadgeView: ConstraintLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        initializeViews()
    }

    private fun initializeViews() {
        val inflater = context.getSystemService(Context
            .LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.activity_badge_view, this)
//        layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)//this is needed, i don't understand why though
    }

}