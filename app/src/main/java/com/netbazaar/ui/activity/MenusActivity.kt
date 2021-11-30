package com.netbazaar.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.netbazaar.R
import com.netbazaar.adapter.*
import kotlinx.android.synthetic.main.activity_menus.*
import kotlinx.android.synthetic.main.activity_tables.*
import kotlinx.android.synthetic.main.silder_cart_list_layout.*

class MenusActivity : AppCompatActivity() {

    var popularDishesList = ArrayList<String>()
    var mAdapter: PopularDishesAdapter? = null
    var adapter:CategoriesAdapter? = null
    var cAdapter:ChineseAdapter? = null
    var cartAdapter:CartAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menus)

        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")

        recyclerviewPopularDishes.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MenusActivity,LinearLayoutManager.HORIZONTAL,true)
            adapter = PopularDishesAdapter(popularDishesList,this@MenusActivity)
            mAdapter = adapter as PopularDishesAdapter
            mAdapter!!.notifyDataSetChanged()
        }

        recyclerviewCategories.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MenusActivity,LinearLayoutManager.HORIZONTAL,true)
            adapter = CategoriesAdapter(popularDishesList,this@MenusActivity)
            adapter = adapter as CategoriesAdapter
            adapter!!.notifyDataSetChanged()
        }

        recyclerviewChineese.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MenusActivity,LinearLayoutManager.HORIZONTAL,true)
            cAdapter = ChineseAdapter(popularDishesList,this@MenusActivity)
            cAdapter = cAdapter as ChineseAdapter
            cAdapter!!.notifyDataSetChanged()
        }


        /*recyclerviewCartList.apply{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,true)
            cartAdapter = CartAdapter(popularDishesList,applicationContext)
            cartAdapter = cartAdapter as CartAdapter
            cartAdapter!!.notifyDataSetChanged()
        }*/
    }
}