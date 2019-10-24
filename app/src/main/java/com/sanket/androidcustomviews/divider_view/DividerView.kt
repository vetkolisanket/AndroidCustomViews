package com.sanket.androidcustomviews.divider_view

import android.content.Context
import android.graphics.Canvas
import android.graphics.DashPathEffect
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.sanket.androidcustomviews.R

/**
 * Created by Sanket on 2019-10-24.
 */
class DividerView: View {
    private val ORIENTATION_HORIZONTAL = 0
    private val ORIENTATION_VERTICAL = 1
    private lateinit var mPaint: Paint
    private var orientation: Int = 0

    constructor(context: Context, attrs: AttributeSet?): super(context, attrs) {
        val dashGap: Int
        val dashLength: Int
        val dashThickness: Int
        val color: Int

        val a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.DividerView, 0, 0)

        try {
            dashGap = a.getDimensionPixelSize(R.styleable.DividerView_dashGap, 5)
            dashLength = a.getDimensionPixelSize(R.styleable.DividerView_dashLength, 5)
            dashThickness = a.getDimensionPixelSize(R.styleable.DividerView_dashThickness, 3)
            color = a.getColor(R.styleable.DividerView_color, -0x1000000)
            orientation = a.getInt(R.styleable.DividerView_orientation, ORIENTATION_HORIZONTAL)
        } finally {
            a.recycle()
        }

        mPaint = Paint()
        mPaint.isAntiAlias = true
        mPaint.color = color
        mPaint.style = Paint.Style.STROKE
        mPaint.strokeWidth = dashThickness.toFloat()
        mPaint.pathEffect = DashPathEffect(floatArrayOf(dashLength.toFloat(), dashGap.toFloat()), 0f)
    }

    constructor(context: Context): super(context)

    override fun onDraw(canvas: Canvas) {
        if (orientation == ORIENTATION_HORIZONTAL) {
            val center = height * .5f
            canvas.drawLine(0F, center, width.toFloat(), center, mPaint)
        } else {
            val center = width * .5f
            canvas.drawLine(center, 0F, center, height.toFloat(), mPaint)
        }
    }
}