package com.netbazaar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.netbazaar.R

class CategoriesAdapter(
    private val popularDishList: ArrayList<String>,
    val context: Context,
) : RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.category_list_item_regular, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CategoriesViewHolder,
        position: Int
    ) {
        holder.bindView(popularDishList,context,position)
    }

    override fun getItemCount(): Int {
        return popularDishList!!.size
    }

    open class CategoriesViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){

        fun bindView(popularDishList: ArrayList<String>, context: Context, position: Int) {

        }
    }
}