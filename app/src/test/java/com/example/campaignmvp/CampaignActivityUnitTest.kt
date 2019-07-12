package com.example.campaignmvp

import com.example.campaignmvp.network.response.CampaignResponse
import com.example.campaignmvp.presenter.CampaignPresenter
import com.example.campaignmvp.view.CampaignView
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

class CampaignActivityUnitTest {
    @Mock
    lateinit var presenter: CampaignPresenter

    @Mock
    lateinit var mainView: CampaignView


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testOnGetBannerSuccess() {
        val campaignResponse = CampaignResponse(null, null)
        `when`(presenter.getBanners()).then {
            mainView.onGetBanners(campaignResponse)
        }
        presenter.getBanners()
        verify(mainView, times(1)).onGetBanners(campaignResponse)
    }


    @Test
    fun testOnGetBannersFailure() {
        `when`(presenter.getBanners()).then {
            mainView.onGetBannersError()
        }
        presenter.getBanners()
        verify(mainView, times(1)).onGetBannersError()
    }
}
