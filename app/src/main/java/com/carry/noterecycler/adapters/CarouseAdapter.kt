package com.carry.noterecycler.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.carry.noterecycler.R
import com.carry.noterecycler.databinding.LayoutCarouseAdapterBinding
import com.carry.noterecycler.databinding.LayoutStaggeredAdapterBinding
import com.carry.noterecycler.entity.GridDto
import com.carry.noterecycler.entity.StaggeredDto


/**
 * Create by SunnyDay /08/13 21:35:46
 */
class CarouseAdapter(
    val data: List<Int>
) : Adapter<CarouseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: LayoutCarouseAdapterBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.layout_carouse_adapter,
            parent,
            false
        )
        return CarouseViewHolder(binding)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: CarouseViewHolder, position: Int) {
        holder.binding.run {
            val imageRes = data[position]
            carouselImageView.setImageResource(imageRes)
        }
    }
}

data class CarouseViewHolder(val binding: LayoutCarouseAdapterBinding) : ViewHolder(binding.root)