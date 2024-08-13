package com.carry.noterecycler.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.carry.noterecycler.R
import com.carry.noterecycler.databinding.LayoutStaggeredAdapterBinding


/**
 * Create by SunnyDay /08/13 21:35:46
 */
class StaggeredAdapter(
    private val colorList: List<Int>
) : Adapter<StaggeredViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StaggeredViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: LayoutStaggeredAdapterBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.layout_staggered_adapter,
            parent,
            false
        )
        return StaggeredViewHolder(binding)
    }

    override fun getItemCount() = colorList.size

    override fun onBindViewHolder(holder: StaggeredViewHolder, position: Int) {
        holder.binding.run {
            val colorRes = colorList[position]
            img.setBackgroundColor(colorRes)

        }
    }
}

data class StaggeredViewHolder(val binding: LayoutStaggeredAdapterBinding) :
    ViewHolder(binding.root)