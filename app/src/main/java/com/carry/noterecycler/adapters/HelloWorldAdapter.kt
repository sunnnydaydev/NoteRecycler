package com.carry.noterecycler.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.carry.noterecycler.R
import com.carry.noterecycler.databinding.LayoutHelloWorldAdapterBinding

/**
 * Create by SunnyDay /06/21 22:28:50
 */
data class HelloWorldAdapter(
    val data: List<String>
) : Adapter<HelloWorldViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelloWorldViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: LayoutHelloWorldAdapterBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.layout_hello_world_adapter,
            parent,
            false
        )
        return HelloWorldViewHolder(binding)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: HelloWorldViewHolder, position: Int) {
        holder.binding.run {
            tvText.text = data[position]
        }
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
}

data class HelloWorldViewHolder(val binding: LayoutHelloWorldAdapterBinding) :
    ViewHolder(binding.root)