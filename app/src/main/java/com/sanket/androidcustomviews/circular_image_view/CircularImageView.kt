package com.sanket.androidcustomviews.circular_image_view

import android.content.Context
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet

/**
 * Created by Sanket on 2019-08-19.
 */
class CircularImageView: AppCompatImageView {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private lateinit var paint: Paint
    private lateinit var paintBorder: Paint
    private var bitmap: Bitmap? = null


    init {
        initializeViews()
    }

    fun initializeViews() {
        paint = Paint()
        paint.isAntiAlias = true

        paintBorder = Paint()
        paintBorder.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        loadBitmap()

        if (bitmap != null) {
            val bitmapShader = BitmapShader(
                Bitmap.createScaledBitmap(bitmap, canvas!!.width, canvas.height, false),
                Shader.TileMode.CLAMP,
                Shader.TileMode.CLAMP
            )
            paint.shader = bitmapShader
        }

    }

    private fun loadBitmap() {
        val bitmapDrawable = drawable as BitmapDrawable
        bitmap = bitmapDrawable.bitmap
    }

}