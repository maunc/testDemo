package com.us.mytestdemo.utils

import android.content.Context
import android.content.SharedPreferences
import com.us.mytestdemo.App

/**
 *ClsFunction：
 *CreateDate：2023/9/5
 *Author：TimeWillRememberUs
 */
class SPUtils {

    companion object {
        private const val TAG = "SPUtils"
        private const val spKey = "sp"
        private const val strDefault = "default"
        private const val intDefault = -1
        private const val boolDefault = false
        val INSTANCE:SPUtils by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SPUtils()
        }
    }
    private val sp: SharedPreferences by lazy {
        App.INSTANCE.getSharedPreferences(spKey, Context.MODE_PRIVATE)
    }

    private val edit: SharedPreferences.Editor by lazy {
        App.INSTANCE.getSharedPreferences(spKey, Context.MODE_PRIVATE).edit()
    }

    fun setString(key: String, value: String):SPUtils {
        edit.putString(key, value).apply()
        return INSTANCE
    }

    fun getString(key: String): String? {
        return sp.getString(key, strDefault)
    }

    fun setInt(key: String,value:Int):SPUtils{
        edit.putInt(key,value).apply()
        return INSTANCE
    }

    fun getInt(key: String): Int {
        return sp.getInt(key, intDefault)
    }

    fun setBoolean(key: String,value:Boolean) :SPUtils{
        edit.putBoolean(key,value).apply()
        return INSTANCE
    }

    fun getBoolean(key: String):Boolean{
        return sp.getBoolean(key, boolDefault)
    }

}