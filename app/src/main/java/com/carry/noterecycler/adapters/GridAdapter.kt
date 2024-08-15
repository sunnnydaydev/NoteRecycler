package com.carry.noterecycler.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.carry.noterecycler.R
import com.carry.noterecycler.databinding.LayoutGridAdapterBinding
import com.carry.noterecycler.entity.GridDto

/**
 * Create by SunnyDay /06/21 22:28:50
 */
data class CardAdapter(val data: List<GridDto>) : Adapter<CardViewHolder>() {

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
        holder.binding.run {
            tvText.text = data[position].text
            tvText.setBackgroundColor(data[position].bgColor)

            val params = tvText.layoutParams as ConstraintLayout.LayoutParams
            params.height =  (100..1000).random()
            tvText.layoutParams = params
        }
    }


    override fun getItemCount() = data.size


}

data class CardViewHolder(val binding: LayoutGridAdapterBinding) : ViewHolder(binding.root)