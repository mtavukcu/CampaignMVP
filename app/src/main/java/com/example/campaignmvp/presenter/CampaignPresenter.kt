package com.example.campaignmvp.presenter

import com.example.campaignmvp.network.CampaignClient
import com.example.campaignmvp.network.response.CampaignResponse
import com.example.campaignmvp.network.CampaignService
import com.example.campaignmvp.view.Presenter
import com.example.campaignmvp.view.CampaignView
import retrofit2.Call
import retrofit2.Response

class CampaignPresenter(
    val campaignView: CampaignView
) : Presenter {

    override fun getBanners() {
        CampaignClient.getClient().create(CampaignService::class.java).getCampaign()
            .enqueue(object : retrofit2.Callback<CampaignResponse> {
                override fun onResponse(call: Call<CampaignResponse>, response: Response<CampaignResponse>) {
                    response.body()?.let { campaignResponse ->
                        campaignView.onGetBanners(campaignResponse)
                    }
                }

                override fun onFailure(call: Call<CampaignResponse>, t: Throwable) {
                    campaignView.onGetBannersError()
                }
            })
    }
}