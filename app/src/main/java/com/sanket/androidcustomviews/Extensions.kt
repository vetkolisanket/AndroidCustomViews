package com.sanket.androidcustomviews

import android.content.Context

/**
 * Created by Sanket on 2019-09-11.
 */


fun Context.dpToPx(dp: Float) = dp * this.resources.displayMetrics.density