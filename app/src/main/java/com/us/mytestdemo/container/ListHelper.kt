package com.us.mytestdemo.container

import com.us.mytestdemo.utils.LogUtils

/**
 *ClsFunction：
 *CreateDate：2023/9/5
 *Author：TimeWillRememberUs
 */
class ListHelper {

    companion object {
        const val TAG = "ListHelper"
        var testList = mutableListOf<String>()
        val INSTANCE: ListHelper by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            ListHelper()
        }
    }

    fun toListAdd(content: String): ListHelper {
        testList.add(content)
        return INSTANCE
    }

    fun toListAdd(pos: Int, content: String): ListHelper {
        if (pos > testList.size) {
            LogUtils.e(TAG,"toListAdd:本次添加越界")
        } else {
            testList.add(pos,content)
        }
        return INSTANCE
    }

    fun toListRemove(pos: Int): ListHelper {
        if(pos >= testList.size) {
            LogUtils.e(TAG,"toListRemove:本次删除位置越界")
        } else {
            testList.removeAt(pos)
        }
        return INSTANCE
    }


    fun toListUpdate(pos: Int, content: String): ListHelper {
        if (pos >= testList.size) {
            LogUtils.e(TAG,"toListUpdate:本次修改位置越界")
        } else {
            testList[pos] = content
        }
        return INSTANCE
    }

    fun toListSelect(): ListHelper {
        for (s in testList) {
            LogUtils.e(TAG, "select: $s")
        }
        LogUtils.showLogLine(TAG)
        return INSTANCE
    }

    fun getListSize(): ListHelper {
        LogUtils.e(TAG, "getSize: ${testList.size}")
        LogUtils.showLogLine(TAG)
        return INSTANCE
    }
}