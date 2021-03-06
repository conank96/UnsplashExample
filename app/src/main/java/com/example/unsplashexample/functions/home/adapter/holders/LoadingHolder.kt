package com.tapi.android.example.functions.home.adapter.holders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.unsplashexample.databinding.LoadingItemBinding

class LoadingHolder(private val itemView: LoadingItemBinding) : RecyclerView.ViewHolder(itemView.root) {


    companion object {
        fun create(parentView: ViewGroup): LoadingHolder {
            return LoadingHolder(
                LoadingItemBinding.inflate(
                    LayoutInflater.from(parentView.context),
                    parentView,
                    false
                )
            )

        }
    }
}