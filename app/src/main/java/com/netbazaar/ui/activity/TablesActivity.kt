package com.netbazaar.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.netbazaar.R
import com.netbazaar.adapter.TablesAdapter
import kotlinx.android.synthetic.main.activity_tables.*

class TablesActivity : AppCompatActivity() {

    var tableList = ArrayList<String>()
    var mAdapter: TablesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tables)

        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")
        tableList.add("Hii")


        recyclerviewTables.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(this@TablesActivity,4)
            adapter = TablesAdapter(tableList,this@TablesActivity)
            mAdapter = adapter as TablesAdapter
            mAdapter!!.notifyDataSetChanged()
        }

    }
}