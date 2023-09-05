package com.us.mytestdemo.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 *ClsFunction：
 *CreateDate：2023/9/5
 *Author：TimeWillRememberUs
 */
class ItemDecHelper(var flag: Int) : RecyclerView.ItemDecoration() {

    companion object {
        const val mainRec = 1
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        if (flag == mainRec) {
            outRect.bottom = ResourcesUtils.dimen_15
            outRect.top = ResourcesUtils.dimen_15
        }
    }
}