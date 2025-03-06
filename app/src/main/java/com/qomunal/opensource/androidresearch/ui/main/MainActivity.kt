package com.qomunal.opensource.androidresearch.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import com.qomunal.opensource.androidresearch.R
import com.qomunal.opensource.androidresearch.common.base.BaseActivity
import com.qomunal.opensource.androidresearch.common.ext.showToast
import com.qomunal.opensource.androidresearch.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val viewModel: MainViewModel by viewModels()
    private val router: MainRouter by lazy {
        MainRouter(this)
    }

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initUI() {
        binding.apply {
            tvReadMore.apply {
                setCollapsedText("More")
                setExpandedText("Less")
                setCollapsedTextColor(R.color.more)
                setExpandedTextColor(R.color.less)
                setTrimLines(4)
            }
        }
    }

    override fun initObserver() {
        viewModel.apply {

        }
    }

}