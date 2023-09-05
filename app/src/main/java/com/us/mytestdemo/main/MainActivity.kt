package com.us.mytestdemo.main

import androidx.recyclerview.widget.LinearLayoutManager
import com.us.mytestdemo.R
import com.us.mytestdemo.base.BaseActivity
import com.us.mytestdemo.databinding.ActivityMainBinding
import com.us.mytestdemo.utils.ItemDecHelper
import com.us.mytestdemo.utils.LogUtils

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main),
    MainRecAdapter.MainRecItemClick {

    private val mainData = listOf("list的用法", "map的用法", "set的用法")

    override fun initData() {
        mDataBinding.mainRec.layoutManager = LinearLayoutManager(this)
        mDataBinding.mainRec.addItemDecoration(ItemDecHelper(ItemDecHelper.mainRec))
        mDataBinding.mainRec.adapter = MainRecAdapter(mainData, this)
    }

    override fun onItemClickListener(pos: Int) {
        LogUtils.e(TAG, "$pos")
    }
}