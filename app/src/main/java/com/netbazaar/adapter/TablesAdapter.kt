package com.netbazaar.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView
import com.netbazaar.R
import com.netbazaar.ui.activity.MenusActivity
import com.netbazaar.ui.activity.PinCodeActivity

class TablesAdapter(
    private val tableList: ArrayList<String>,
    val context: Context,
) : RecyclerView.Adapter<TablesAdapter.TableViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.tables_list_item, parent, false)
        return TableViewHolder(view)
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
        holder.bindView(tableList,context,position)
    }

    override fun getItemCount(): Int {
        return tableList!!.size
    }


    open class TableViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        private val btnOrder: FrameLayout= itemView!!.findViewById(R.id.btnOrder)
        fun bindView(tableList: ArrayList<String>, context: Context, position: Int) {

                btnOrder.setOnClickListener {
                    val intent = Intent(context, MenusActivity::class.java)
                    context.startActivity(intent)
                }
        }
    }
}