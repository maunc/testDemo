package com.us.mytestdemo.utils

import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.us.mytestdemo.App

/**
 *ClsFunction：
 *CreateDate：2023/9/5
 *Author：TimeWillRememberUs
 */
object ToastUtils {

    fun showToast(content:String) {
        Toast.makeText(App.INSTANCE,content,Toast.LENGTH_SHORT).show()
    }

}