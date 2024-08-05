package com.carry.noterecycler

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.carry.noterecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val mBinding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        addWindowInsets()
        mBinding.run {
            tvHelloWorld.setOnClickListener {
                Log.d("MainActivity","tvHelloWorld")
                startActivity(Intent(this@MainActivity,HelloWordActivity::class.java))
            }

            tvLayoutManager.setOnClickListener {
                startActivity(Intent(this@MainActivity,LayoutManagerActivity::class.java))
            }
        }

    }

    private fun addWindowInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(mBinding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}