package com.example.campaignmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campaignmvp.R
import com.example.campaignmvp.network.response.BannerModel
import com.example.campaignmvp.network.response.CampaignResponse
import com.example.campaignmvp.network.response.DealModel
import com.example.campaignmvp.presenter.CampaignPresenter
import kotlinx.android.synthetic.main.activity_main.*

class CampaignActivity : AppCompatActivity(), CampaignView {

    private val presenter by lazy {
        CampaignPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        presenter.getBanners()
    }

    override fun onGetBanners(campaignResponse: CampaignResponse) {
        Toast.makeText(this@CampaignActivity, "Success", Toast.LENGTH_SHORT).show()

        val dataSet = buildArray(campaignResponse.hotDeals ?: emptyArray(), campaignResponse.banners ?: emptyArray())

        recyclerView.adapter = CampaignAdapter(dataSet)
    }

    override fun onGetBannersError() {
        Toast.makeText(this@CampaignActivity, "Failure", Toast.LENGTH_SHORT).show()
    }

    fun buildArray(evens: Array<DealModel>, odds: Array<BannerModel>): MutableList<Any> {
        return mutableListOf<Any>().apply {
            for (x in 0 until evens.size + odds.size) {
                when (x % 2) {
                    0 -> add(x, evens[x % 10])
                    1 -> add(x, odds[x % 10])
                }
            }
        }
    }
}
