package com.example.campaignmvp.network

import com.example.campaignmvp.network.response.CampaignResponse
import retrofit2.Call
import retrofit2.http.GET

interface CampaignService {
    @GET("campaigns/{page}")
    fun getCampaign():Call<CampaignResponse>
}