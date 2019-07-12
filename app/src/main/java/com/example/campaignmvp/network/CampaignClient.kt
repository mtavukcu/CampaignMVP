package com.example.campaignmvp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CampaignClient {
    companion object {
        fun getClient(): Retrofit = Retrofit.Builder()
            .baseUrl("http://private-d190ab-campaigns19.apiary-mock.com")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}