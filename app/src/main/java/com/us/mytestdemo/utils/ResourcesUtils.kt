package com.us.mytestdemo.utils

import com.us.mytestdemo.App
import com.us.mytestdemo.R

/**
 *ClsFunction：
 *CreateDate：2023/9/5
 *Author：TimeWillRememberUs
 */
object ResourcesUtils {

    val dimen_15: Int by lazy {
        App.INSTANCE.resources.getDimension(R.dimen.y15).toInt()
    }

}