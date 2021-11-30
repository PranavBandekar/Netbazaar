package com.netbazaar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.netbazaar.R

class ChineseAdapter (
    private val popularDishList: ArrayList<String>,
    val context: Context,
) : RecyclerView.Adapter<ChineseAdapter.ChineseViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChineseAdapter.ChineseViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.chineese_item, parent, false)
        return ChineseAdapter.ChineseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChineseAdapter.ChineseViewHolder, position: Int) {
        holder.bindView(popularDishList,context,position)
    }

    override fun getItemCount(): Int {
        return popularDishList!!.size
    }
    open class ChineseViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){

        fun bindView(popularDishList: ArrayList<String>, context: Context, position: Int) {

        }
    }
}