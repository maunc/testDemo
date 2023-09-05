package com.us.mytestdemo

import android.app.Application

/**
 *ClsFunction：
 *CreateDate：2023/9/5
 *Author：TimeWillRememberUs
 */
class App: Application() {

    companion object {
        lateinit var INSTANCE :App
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}