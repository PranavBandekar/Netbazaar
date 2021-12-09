package com.netbazaar.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.netbazaar.R
import com.netbazaar.adapter.*
import kotlinx.android.synthetic.main.activity_menus.*
import kotlinx.android.synthetic.main.activity_tables.*
import kotlinx.android.synthetic.main.order_view.*
import kotlinx.android.synthetic.main.silder_cart_list_layout.*
import android.R.attr.button
import android.R.attr

import android.widget.RelativeLayout




class MenusActivity : AppCompatActivity() {

    var popularDishesList = ArrayList<String>()
    var cartList = ArrayList<String>()
    var mAdapter: PopularDishesAdapter? = null
    var catAdapter:CategoriesAdapter? = null
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
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")
        popularDishesList.add("Hii")

        cartList.add("Hii")
        cartList.add("Hii")


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
            catAdapter = adapter as CategoriesAdapter
            catAdapter!!.notifyDataSetChanged()
        }

        recyclerviewChineese.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MenusActivity,LinearLayoutManager.HORIZONTAL,true)
            adapter = ChineseAdapter(popularDishesList,this@MenusActivity)
            cAdapter = adapter as ChineseAdapter
            cAdapter!!.notifyDataSetChanged()
        }

        cartImage.setOnClickListener {
            val params = orderLayout.getLayoutParams() as RelativeLayout.LayoutParams
            params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT)
            params.addRule(RelativeLayout.LEFT_OF, com.netbazaar.R.id.detailsLayout)
            btnOrderViewTable.visibility = View.VISIBLE
            animateViewIn(sliderLayout,400,false)
            animateViewIn(orderLayout,400,false)
        }

        btnContinueShopping.setOnClickListener {
            animateViewOut(detailsLayout,400)
            animateViewOut(orderLayout,400)
            animateViewOut(sliderLayout,400)

        }

        btnPlaceOrder.setOnClickListener {
            val params = orderLayout.getLayoutParams() as RelativeLayout.LayoutParams
            params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0)
            params.addRule(RelativeLayout.LEFT_OF, com.netbazaar.R.id.detailsLayout)
            btnOrderViewTable.visibility = View.GONE
            orderLayout.setLayoutParams(params) //causes layout update
            animateViewIn(detailsLayout,150,true)
        }



        recyclerviewCartList.apply{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,true)
            adapter = CartAdapter(cartList,applicationContext)
            cartAdapter = adapter as CartAdapter
            cartAdapter!!.notifyDataSetChanged()
        }
    }

    private fun animateViewIn(v:View, delay:Long,setLayout:Boolean){

        val animationIn = AnimationUtils.loadAnimation(this@MenusActivity, R.anim.right_enter)
        animationIn.duration = delay
        animationIn.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
                runOnUiThread {
                    if(setLayout){

                        v.visibility = View.VISIBLE
                    }else{
                        v.visibility = View.VISIBLE
                    }

                }
            }
            override fun onAnimationRepeat(animation: Animation) { }
            override fun onAnimationEnd(animation: Animation) {
                if(setLayout) {

                }
            }
        })
        v.startAnimation(animationIn)
    }
    private fun animateViewOut(v:View, delay:Long){
        val animationIn = AnimationUtils.loadAnimation(this@MenusActivity, R.anim.right_out)
        animationIn.duration = delay
        animationIn.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
                runOnUiThread {
                    v.visibility = View.GONE
                   //
                }
            }
            override fun onAnimationRepeat(animation: Animation) { }
            override fun onAnimationEnd(animation: Animation) {

            }
        })
        v.startAnimation(animationIn)
    }
}