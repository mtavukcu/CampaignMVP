package com.example.campaignmvp.network.response

data class CampaignResponse(
    val hotDeals: Array<DealModel>?,
    val banners: Array<BannerModel>?)