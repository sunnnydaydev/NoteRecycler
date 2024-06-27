package com.carry.noterecycler.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.carry.noterecycler.R
import com.carry.noterecycler.databinding.LayoutHelloWorldAdapterBinding
import com.carry.noterecycler.helper.BindListItem
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Create by SunnyDay /06/21 22:28:50
 */
data class HelloWorldAdapter(
    val data: List<String>
) : Adapter<HelloWorldViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelloWorldViewHolder {
        Log.d("HelloWorldAdapter","onCreateViewHolder parent->${parent}")
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_hello_world_adapter, parent, false)
        Log.d("HelloWorldAdapter","onCreateViewHolder-> rootView $rootView")
        return HelloWorldViewHolder(rootView)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: HelloWorldViewHolder, position: Int) {
        Log.d("HelloWorldAdapter","onBindViewHolder->mBinding:${holder.mBinding}")
        holder.mBinding.run {
            tvText.text = data[position]
        }
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
}

data class HelloWorldViewHolder(val view: View) : ViewHolder(view) {
    val mBinding :LayoutHelloWorldAdapterBinding by BindListItem(view)
}