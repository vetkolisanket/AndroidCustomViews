package com.sanket.androidcustomviews.facebook_like_emotions

import androidx.annotation.StringDef

/**
 * Created by Sanket on 2019-11-23.
 */
object Emotions {

    const val LIKE = "LIKE"
    const val HAPPY = "HAPPY"
    const val SAD = "SAD"
    const val NEUTRAL = "NEUTRAL"
    const val SATISFIED = "SATISFIED"
    const val DISSATISFIED = "DISSATISFIED"

    @StringDef(LIKE, HAPPY, SAD, NEUTRAL, SATISFIED, DISSATISFIED)
    @Retention(AnnotationRetention.SOURCE)
    annotation class Emotion

}