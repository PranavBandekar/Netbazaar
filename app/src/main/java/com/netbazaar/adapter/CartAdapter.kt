package com.netbazaar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.netbazaar.R

class CartAdapter(
    private val cartItemList: ArrayList<String>,
    val context: Context,
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CartViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.cart_list_item, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bindView(cartItemList,context,position)
    }

    override fun getItemCount(): Int {
        return cartItemList!!.size
    }

    open class CartViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){

        fun bindView(cartItemList: ArrayList<String>, context: Context, position: Int) {

        }
    }
}