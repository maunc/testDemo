package com.us.mytestdemo.function

import com.us.mytestdemo.R
import com.us.mytestdemo.base.BaseActivity
import com.us.mytestdemo.databinding.ActivityTestFunctionBinding
import com.us.mytestdemo.utils.LogUtils

class TestFunctionActivity :
    BaseActivity<ActivityTestFunctionBinding>(R.layout.activity_test_function) {

    override fun initData() {
        //创建帮助类对象  val不可更改   var 可以更改
        //这段代码是调用帮助类中  扩展函数的用法
        val kzhsHelper = KzhsHelper()
        kzhsHelper.memberFun()
        LogUtils.showLogLine(TAG)
        kzhsHelper.kzhs1()
        LogUtils.showLogLine(TAG)
        LogUtils.e(TAG, kzhsHelper.kzhs2())

        //这段代码是调用帮助类中   扩展函数的特性
        PersonFeeding(Animal())  //传入一个父类对象
        PersonFeeding(Cat())  //传入一个子类对象
    }

    //这里我们定义一个函数，入参为父类
    fun PersonFeeding(animal: Animal) {
        println(animal.eat())
    }

}