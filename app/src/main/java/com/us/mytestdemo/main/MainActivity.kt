package com.us.mytestdemo.main

import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.us.mytestdemo.R
import com.us.mytestdemo.base.BaseActivity
import com.us.mytestdemo.databinding.ActivityMainBinding
import com.us.mytestdemo.container.TestContainerActivity
import com.us.mytestdemo.function.TestFunctionActivity
import com.us.mytestdemo.javadebug.JavaDeBugActivity
import com.us.mytestdemo.utils.ItemDecHelper

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main),
    MainRecAdapter.MainRecItemClick {

    private val mainData = listOf("Kotlin中集合的用法", "Kotlin中各种函数的用法")

    override fun initData() {
        mDataBinding.mainRec.layoutManager = LinearLayoutManager(this)
        mDataBinding.mainRec.addItemDecoration(ItemDecHelper(ItemDecHelper.mainRec))
        mDataBinding.mainRec.adapter = MainRecAdapter(mainData, this)
        mDataBinding.startJavaAc.setOnClickListener{
            startActivity(Intent(this,JavaDeBugActivity::class.java))
        }
    }

    override fun onItemClickListener(pos: Int) {
        when (pos) {
            MainRecAdapter.ContainerStartFlag -> {
                startActivity(Intent(this, TestContainerActivity::class.java))
            }
            MainRecAdapter.FunStartFlag -> {
                startActivity(Intent(this, TestFunctionActivity::class.java))
            }
        }
    }
}