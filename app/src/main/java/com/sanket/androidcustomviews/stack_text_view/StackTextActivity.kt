package com.sanket.androidcustomviews.stack_text_view

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.sanket.androidcustomviews.R
import com.sanket.androidcustomviews.Utils
import com.sanket.androidcustomviews.dpToPx
import kotlinx.android.synthetic.main.activity_stack_text.*

class StackTextActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, StackTextActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stack_text)

        fillBobbles(listOf("A", "B", "C", "D", "E", "F"))
    }

    private fun fillBobbles(farmers: List<String>) {
        farmers.forEachIndexed { index, farmerGist ->
            run {
                val bobble = getBobble(farmerGist)
                val params =
                    LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                if (index > 0) {
                    params.setMargins(-32, 0, 0, 0)
                }
                bobble.layoutParams = params
                container.addView(bobble)
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val childrenCount = container.childCount
            for (i in (childrenCount - 1) downTo 0) {
                container.getChildAt(i).z = (childrenCount - i).toFloat()
            }
        }
    }

    private fun getBobble(farmerGist: String): TextView {
        val view = TextView(this)
        val px = dpToPx(48f)
        view.width = px.toInt()
        view.height = px.toInt()
        val drawable = resources.getDrawable(R.drawable.circle_bg_white_border_solid_color) as GradientDrawable
        drawable.setColor(Color.parseColor(Utils.getColourResourceIdBasedOnCharacters(farmerGist.first())))
        view.background = drawable
        view.setTextColor(resources.getColor(R.color.white))
        view.gravity = Gravity.CENTER
        view.text = farmerGist.first().toString()

        return view
    }

}
