package com.example.campaignmvp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.campaignmvp.R
import com.example.campaignmvp.databinding.BannerItemBinding
import com.example.campaignmvp.databinding.HotDealBinding
import com.example.campaignmvp.network.response.BannerModel
import com.example.campaignmvp.network.response.DealModel

class CampaignAdapter(val dataSet: MutableList<Any>) :
    RecyclerView.Adapter<BaseHolder>() {

    private val TYPE_DEAL = 1
    private val TYPE_BANNER = 2

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseHolder {

        val inflater = LayoutInflater.from(parent.context)

        if (viewType == TYPE_BANNER) {

            val bannerBinder = DataBindingUtil.inflate<BannerItemBinding>(
                inflater,
                R.layout.banner_item,
                parent,
                false)

            return BannerHolder(bannerBinder)
        }


        val dealBinder = DataBindingUtil.inflate<HotDealBinding>(
            inflater,
            R.layout.hot_deal,
            parent,
            false)

        return DealHolder(dealBinder)

    }


    override fun onBindViewHolder(holder: BaseHolder, position: Int) = holder.bindTo(dataSet[position])

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun getItemViewType(position: Int): Int {
        when (dataSet[position]) {
            is BannerModel -> return TYPE_BANNER
            is DealModel -> return TYPE_DEAL
        }
        return 0
    }
}