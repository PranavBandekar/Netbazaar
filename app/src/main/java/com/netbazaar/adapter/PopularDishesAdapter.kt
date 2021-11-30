package com.netbazaar.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.netbazaar.R
import com.netbazaar.ui.activity.MenusActivity

class PopularDishesAdapter(
    private val popularDishList: ArrayList<String>,
    val context: Context,
) : RecyclerView.Adapter<PopularDishesAdapter.PopularDishesViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):PopularDishesViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.popular_dishes_item, parent, false)
        return PopularDishesViewHolder(view)
    }
    override fun onBindViewHolder(holder: PopularDishesViewHolder, position: Int) {
        holder.bindView(popularDishList,context,position)
    }

    override fun getItemCount(): Int {
        return popularDishList!!.size
    }

    open class PopularDishesViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){

        fun bindView(popularDishList: ArrayList<String>, context: Context, position: Int) {

        }
    }
}