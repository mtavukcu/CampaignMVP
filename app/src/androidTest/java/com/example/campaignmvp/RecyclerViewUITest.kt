package com.example.campaignmvp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.campaignmvp.view.CampaignActivity
import com.example.campaignmvp.view.TYPE_BANNER
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecyclerViewUITest {


    @get:Rule
    var rule = ActivityTestRule(
        CampaignActivity::class.java,
        false,
        true
    )


    @Test
    fun testPopulation() {
        Thread.sleep(1000)
        assertTrue(
            rule.activity.recyclerView.adapter!!.itemCount
                    > 0
        )
    }

    @Test
    fun testChildType() {
        Thread.sleep(1000)
        assertTrue(
            rule.activity.recyclerView.getChildViewHolder(rule.activity.recyclerView.getChildAt(3)).itemViewType == TYPE_BANNER
        )
    }
}
