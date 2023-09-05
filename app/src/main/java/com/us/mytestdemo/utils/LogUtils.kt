package com.us.mytestdemo.utils

import android.util.Log

/**
 *ClsFunction：
 *CreateDate：2023/9/5
 *Author：TimeWillRememberUs
 */
object LogUtils {

    fun showLogLine(className:String) {
        Log.e(className,"------------")
    }

    fun e(className:String,content:String) {
        Log.e(className,content)
    }

}