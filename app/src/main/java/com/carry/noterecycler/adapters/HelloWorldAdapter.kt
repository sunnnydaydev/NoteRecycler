package com.carry.noterecycler.adapters

import android.view.LayoutInflater
import android.view.View
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
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_hello_world_adapter, parent, false)
        return HelloWorldViewHolder(rootView)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: HelloWorldViewHolder, position: Int) {
        holder.mBinding?.run {
            tvText.text = data[position]
        }
    }
}

data class HelloWorldViewHolder(val view: View) : ViewHolder(view) {
    val mBinding: LayoutHelloWorldAdapterBinding? = DataBindingUtil.getBinding(view)
}