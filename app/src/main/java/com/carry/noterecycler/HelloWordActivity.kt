package com.carry.noterecycler

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carry.noterecycler.adapters.HelloWorldAdapter
import com.carry.noterecycler.databinding.ActivityHelloWordBinding

class HelloWordActivity : AppCompatActivity() {
    private val mBinding: ActivityHelloWordBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_hello_word)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        addWindowInsets()
        setUpRvList()
    }

    private fun addWindowInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(mBinding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setUpRvList() {
        val list = mutableListOf<String>()
        repeat(100) { i ->
            list.add("$i")
        }

        mBinding.rvList.run {
            layoutManager = LinearLayoutManager(this@HelloWordActivity)
            addItemDecoration(DividerItemDecoration(context,RecyclerView.VERTICAL))
            adapter = HelloWorldAdapter(data = list)

        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}