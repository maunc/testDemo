package com.us.mytestdemo.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.us.mytestdemo.R

/**
 *ClsFunction：
 *CreateDate：2023/9/5
 *Author：TimeWillRememberUs
 */
class MainRecAdapter(private var data: List<String>, private var itemClick: MainRecItemClick) :
    RecyclerView.Adapter<MainRecAdapter.MainRecViewHolder>() {

    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecViewHolder {
        return MainRecViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_main_rec, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MainRecViewHolder, position: Int) {
        holder.mainItemTv.text = data[position]
        holder.mainItemRoot.setOnClickListener {
            itemClick.onItemClickListener(position)
        }
    }

    interface MainRecItemClick {
        fun onItemClickListener(pos: Int)
    }

    class MainRecViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mainItemTv: AppCompatTextView = itemView.findViewById(R.id.item_main_tv)
        var mainItemRoot: LinearLayout = itemView.findViewById(R.id.item_main_root)
    }
}