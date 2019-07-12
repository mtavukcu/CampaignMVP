package com.example.campaignmvp.view

import com.example.campaignmvp.databinding.HotDealBinding
import com.example.campaignmvp.network.response.DealModel

class DealHolder(private val binding: HotDealBinding) : BaseHolder(binding.root) {

    override fun bindTo(model: Any) {
        if (model is DealModel) {
            binding.item = model
            binding.executePendingBindings()
        }
    }
}