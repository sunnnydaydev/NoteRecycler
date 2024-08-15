package com.carry.noterecycler.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.carry.noterecycler.R
import com.carry.noterecycler.databinding.LayoutStaggeredAdapterBinding
import com.carry.noterecycler.entity.GridDto
import com.carry.noterecycler.entity.StaggeredDto


/**
 * Create by SunnyDay /08/13 21:35:46
 */
class StaggeredAdapter(
    val data: List<StaggeredDto>
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

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: StaggeredViewHolder, position: Int) {
        holder.binding.run {
            tvText.text = data[position].text
            tvText.setBackgroundColor(data[position].bgColor)
            val params = tvText.layoutParams as ConstraintLayout.LayoutParams
            params.height =  (100..1000).random()
            tvText.layoutParams = params
        }
    }
}

data class StaggeredViewHolder(val binding: LayoutStaggeredAdapterBinding) : ViewHolder(binding.root)