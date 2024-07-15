package com.carry.noterecycler.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
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
        Log.d("HelloWorldAdapter","onCreateViewHolder")
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
        Log.d("HelloWorldAdapter","onBindViewHolder:${data[position]}")
        holder.binding.run {
            tvText.text = data[position]
        }
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }


    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        Log.d("HelloWorldAdapter","onAttachedToRecyclerView:")
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        Log.d("HelloWorldAdapter","onDetachedFromRecyclerView:")
    }

    override fun onViewAttachedToWindow(holder: HelloWorldViewHolder) {
        super.onViewAttachedToWindow(holder)
        Log.d("HelloWorldAdapter","onViewAttachedToWindow:")
    }

    override fun onViewDetachedFromWindow(holder: HelloWorldViewHolder) {
        super.onViewDetachedFromWindow(holder)
        Log.d("HelloWorldAdapter","onViewDetachedFromWindow:")
    }

    override fun onViewRecycled(holder: HelloWorldViewHolder) {
        Log.d("HelloWorldAdapter","onViewRecycled:${holder.binding.tvText.text}")
        holder.binding.tvText.text = "adfasf"
        super.onViewRecycled(holder)

    }
}

data class HelloWorldViewHolder(val binding: LayoutHelloWorldAdapterBinding) :
    ViewHolder(binding.root)