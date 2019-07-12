package com.example.campaignmvp.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseHolder(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bindTo(model: Any)
}