package com.example.campaignmvp.view

import com.example.campaignmvp.network.response.CampaignResponse

interface Presenter {
    fun getBanners()
}

interface CampaignView {
    fun onGetBanners(campaignResponse: CampaignResponse)
    fun onGetBannersError()
}