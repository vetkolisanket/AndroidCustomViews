package com.sanket.androidcustomviews.stack_text_view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sanket.androidcustomviews.R

class StackTextActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, StackTextActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stack_text)
    }
}
