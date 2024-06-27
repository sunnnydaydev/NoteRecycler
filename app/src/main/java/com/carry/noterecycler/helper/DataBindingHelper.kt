package com.carry.noterecycler.helper

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Create by SunnyDay /06/27 18:39:48
 */

/**
 * This is a replacement for DataBindingUtil.bind
 *
 *   val binding: ItemPlanetBinding by BindView(view)
 */
class BindListItem<in R : RecyclerView.ViewHolder, out T : ViewDataBinding>(
    private val view: View
) : ReadOnlyProperty<R, T> {

    private var value: T? = null

    override operator fun getValue(thisRef: R, property: KProperty<*>): T {
        if (value == null) {
            value = DataBindingUtil.bind(view)
        }
        return value!!
    }
}