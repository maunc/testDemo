package com.us.mytestdemo.function

import com.us.mytestdemo.utils.LogUtils

/**
 *ClsFunction：
 *CreateDate：2023/9/6
 *Author：TimeWillRememberUs
 */
class KzhsHelper {
    /**
     * 所谓扩展函数，就是对一个现有类扩展定义一个成员函数，不过该定义在类
     * 的外面。一般我们如果想对一个类封装一个 API 方法，
     * 但又不能直接修改该类时，就可以用到扩展函数。
     */
    companion object {
        private const val TAG = "KzhsHelper"
    }

    fun memberFun() {
        LogUtils.e(TAG, "我是memberFun")
    }
}

//定义扩展函数   无返回值
fun KzhsHelper.kzhs1() {
    memberFun()
    LogUtils.e("我是kzhs1", "-->我有点继承的意思")
}

fun KzhsHelper.kzhs2(): String {
    memberFun()
    LogUtils.e("我是kzhs2", "-->我要返回一个值，请看下面")
    return "哈哈哈哈我是扩展函数2"
}

/**
 * 这里  因为kotlin声明class默认为  java中final class
 *   所以kotlin给出 open 这个关键词  标识不为final 即可拓展
 */
//这里模仿一下java中继承
open class Animal {

}

class Cat : Animal() {

}

//分别扩展父类和子类两个同名方法
fun Animal.eat() {
    LogUtils.e("AnimalRun","我是父类的扩展方法")
}

fun Cat.eat() {
    LogUtils.e("CatRun","我是子类的扩展方法")
}