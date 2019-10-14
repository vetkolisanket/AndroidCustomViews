package com.sanket.androidcustomviews.stack_image_view

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.com.stackimageview.customviews.StackImageView
import com.sanket.androidcustomviews.R
import kotlinx.android.synthetic.main.activity_stack_image.*

class StackImageActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, StackImageActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stack_image)

        init()
    }

    private fun init() {
        stackImageView.setImageLists(setImageResources());
        stackImageView.setOnImageClickListener {


        }
        stackImageView.setMaxVisibleImage(5);
        stackImageView.setImageGap(-25);
        stackImageView.setImageDimen(65);
        stackImageView.setImageBorderWidth(3);
        stackImageView.setImageBorderColor(R.color.coral);
        stackImageView.setImageLoaderVisibility(true);
        stackImageView.setImageLoaderDimen(16);
        stackImageView.setImageLoaderColor(R.color.white);
        stackImageView.setImagePHVisibility(true);
        stackImageView.setImagePHDimen(30);
        stackImageView.setImagePlaceHolder(R.mipmap.ic_launcher);
        stackImageView.setImageBackgroundColor(R.color.dark_cyan);

        stackImageView.setCountDimen(65);
        stackImageView.setCountBorderColor(R.color.coral);
        stackImageView.setCountViewPosition(StackImageView.COUNT_POSITION_AFTER);
        stackImageView.setCountBgColor(R.color.dark_cyan);
        stackImageView.setCountTextSize(20);
        stackImageView.setCountTextColor(Color.parseColor("#FFFFFF"));
//        stackImageView.setCountTextFont(R.font.sofia_regular);
        stackImageView.setCountImageInsteadOfText(true);
        stackImageView.setCountImageDimen(30);
        stackImageView.setCountImageSource(R.drawable.ic_more_icon);
        stackImageView.setOverlapType(StackImageView.BOTTOM_TO_TOP_OVERLAP);
    }

    private fun setImageResources(): ArrayList<Any> {
        val imageLists = arrayListOf<Any>()
        imageLists.add(R.mipmap.ic_launcher)
        imageLists.add(R.mipmap.ic_launcher)
        imageLists.add(R.mipmap.ic_launcher)
        imageLists.add(R.mipmap.ic_launcher)
        return imageLists;
    }

}
