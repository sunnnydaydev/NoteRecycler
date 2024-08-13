package com.carry.noterecycler.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.carry.noterecycler.R
import com.carry.noterecycler.databinding.LayoutGridAdapterBinding

/**
 * Create by SunnyDay /06/21 22:28:50
 */
data class CardAdapter(val data: List<String>) : Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: LayoutGridAdapterBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.layout_grid_adapter,
            parent,
            false
        )
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
       holder.binding.tvText.text = data[position]
    }


    override fun getItemCount() = data.size


}

data class CardViewHolder(val binding: LayoutGridAdapterBinding) : ViewHolder(binding.root)