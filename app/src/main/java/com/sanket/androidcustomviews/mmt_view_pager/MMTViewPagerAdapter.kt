package com.sanket.androidcustomviews.mmt_view_pager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sanket.androidcustomviews.R

/**
 * Created by Sanket on 2019-10-27.
 */
class MMTViewPagerAdapter: RecyclerView.Adapter<MMTViewPagerAdapter.MMTViewPagerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MMTViewPagerViewHolder {
        return MMTViewPagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_mmt_view_holder, parent, false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: MMTViewPagerViewHolder, position: Int) {
        holder.bind()
    }


    class MMTViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind() {

        }

    }

}