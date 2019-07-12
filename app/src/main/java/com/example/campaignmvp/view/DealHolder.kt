package com.example.campaignmvp.view

import com.example.campaignmvp.databinding.CampaignHotDealBinding
import com.example.campaignmvp.network.response.DealModel

class DealHolder(private val binding: CampaignHotDealBinding) : BaseHolder(binding.root) {

    override fun bindTo(model: Any) {
        if (model is DealModel) {
            binding.item = model
            binding.executePendingBindings()
        }
    }
}