package com.sanket.androidcustomviews.mmt_view_pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * Created by Sanket on 2019-10-27.
 */
class MMTPagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    // TODO: 2019-10-27 store the instances of fragments created in a map and reuse
    override fun getItem(position: Int): Fragment {
        return MMTFragment.getInstance()
    }

    override fun getCount(): Int {
        return 10
    }

    /*override fun getPageWidth(position: Int): Float {
        return 0.8f
    }*/

}