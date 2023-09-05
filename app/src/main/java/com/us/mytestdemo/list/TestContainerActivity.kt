package com.us.mytestdemo.list

import com.us.mytestdemo.R
import com.us.mytestdemo.base.BaseActivity
import com.us.mytestdemo.databinding.ActivityTestContainerBinding

class TestContainerActivity : BaseActivity<ActivityTestContainerBinding>(R.layout.activity_test_container) {

    override fun initData() {
        mDataBinding.testContainerListBtu.setOnClickListener{
            ListHelper.INSTANCE
                .toListAdd("卡卡罗特")
                .toListAdd("路飞")
                .toListAdd("黑崎一护")
                .toListAdd("漩涡鸣人")
                .toListSelect()
                .getListSize()
                .toListAdd(10,"dawda")
                .toListUpdate(10,"dwad")
                .toListUpdate(3,"柯南")
                .toListSelect()
        }
    }

}