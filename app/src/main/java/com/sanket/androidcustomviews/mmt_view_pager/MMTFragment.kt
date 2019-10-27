package com.sanket.androidcustomviews.mmt_view_pager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sanket.androidcustomviews.R

/**
 * Created by Sanket on 2019-10-27.
 */
class MMTFragment: Fragment() {

    companion object {
        fun getInstance(): MMTFragment {
            return MMTFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mmt_view_pager, container, false)
    }

}