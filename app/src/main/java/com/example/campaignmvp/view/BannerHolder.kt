package com.example.campaignmvp.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.campaignmvp.databinding.BannerItemBinding
import com.example.campaignmvp.network.response.BannerModel

class BannerHolder(private val binding: BannerItemBinding) : BaseHolder(binding.root) {
    override fun bindTo(model: Any) {
        if (model is BannerModel) {
            binding.apply {
                banner = model
                executePendingBindings()
            }
        }
    }

    companion object {
        @BindingAdapter("loadUrl")
        @JvmStatic
        fun loadUrl(view: ImageView, url: String) {
            Glide.with(view)
                .load(url)
                .into(view)
        }
    }
}