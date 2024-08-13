package com.carry.noterecycler

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.carry.noterecycler.adapters.CardAdapter
import com.carry.noterecycler.adapters.StaggeredAdapter
import com.carry.noterecycler.databinding.ActivityLayoutManagerBinding

class LayoutManagerActivity : AppCompatActivity() {
    private val mBinding: ActivityLayoutManagerBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_layout_manager)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(mBinding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // setUpGridRvList()
        setupStaggeredRvList()
    }

    private fun setUpGridRvList() {
        val list = mutableListOf<String>()
        repeat(100) { i ->
            list.add("$i")
        }

        val manager = GridLayoutManager(this@LayoutManagerActivity,4,LinearLayoutManager.VERTICAL,false)
        manager.spanSizeLookup = object : SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return if (position==1){
                    2
                }else{
                    1
                }

            }
        }
        mBinding.rvList.run {
            layoutManager = manager
            adapter = CardAdapter(list)
        }
    }

    private fun setupStaggeredRvList(){
        val list = listOf(
            Color.RED,
            Color.BLUE,
            Color.CYAN,
            Color.GRAY,
            Color.DKGRAY,
            Color.BLACK,
            Color.GREEN,
            Color.LTGRAY,
            Color.MAGENTA,
            Color.WHITE,
            Color.YELLOW,
        )
        val manager = StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
        mBinding.rvList.run {
            layoutManager = manager
            adapter = StaggeredAdapter(list)
        }
    }
}