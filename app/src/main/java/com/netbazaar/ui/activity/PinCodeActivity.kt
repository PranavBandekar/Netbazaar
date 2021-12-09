package com.netbazaar.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.netbazaar.R
import kotlinx.android.synthetic.main.activity_pin_code.*

class PinCodeActivity : AppCompatActivity() {

    var pinCode = arrayOf(11, 11, 11, 11, 11, 11)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_code)
        setListeners()
    }

    private fun setListeners() {
        mEnter.setOnClickListener {
            val intent = Intent(this@PinCodeActivity, SelectOptionActivity::class.java)
            startActivityForResult(intent,100)
        }

        mClear.setOnClickListener {
            for (i in pinCode.indices)
            {
                pinCode[i] = 11
            }
            mFirstView.setBackgroundResource(R.drawable.circle_border)
            mSecondView.setBackgroundResource(R.drawable.circle_border)
            mThirdView.setBackgroundResource(R.drawable.circle_border)
            mFourthView.setBackgroundResource(R.drawable.circle_border)
            mFifthView.setBackgroundResource(R.drawable.circle_border)
            mSixthView.setBackgroundResource(R.drawable.circle_border)
        }

        mNumberZero.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,0)
                setPincodeViewBackground(indexOf)
            }

        }
        mNumberOne.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,1)
                setPincodeViewBackground(indexOf)
            }

        }
        mNumberTwo.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,2)
                setPincodeViewBackground(indexOf)
            }

        }
        mNumberThree.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,3)
                setPincodeViewBackground(indexOf)
            }

        }
        mNumberFour.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,4)
                setPincodeViewBackground(indexOf)
            }

        }
        mNumberFive.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,5)
                setPincodeViewBackground(indexOf)
            }

        }
        mNumberSix.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,6)
                setPincodeViewBackground(indexOf)
            }

        }
        mNumberSeven.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,7)
                setPincodeViewBackground(indexOf)
            }

        }
        mNUmberEight.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1) {
                pinCode.set(indexOf,8)
                setPincodeViewBackground(indexOf)
            }

        }
        mNumberNine.setOnClickListener {
            val indexOf = findIndex(pinCode,11)
            if(indexOf != -1){
                pinCode.set(indexOf,9)
                setPincodeViewBackground(indexOf)
            }
        }
    }

    private fun setPincodeViewBackground(indexOf: Int) {
        when(indexOf){
            0 ->  mFirstView.setBackgroundResource(R.drawable.circle)
            1 ->  mSecondView.setBackgroundResource(R.drawable.circle)
            2 ->  mThirdView.setBackgroundResource(R.drawable.circle)
            3 ->  mFourthView.setBackgroundResource(R.drawable.circle)
            4 ->  mFifthView.setBackgroundResource(R.drawable.circle)
            5 ->  mSixthView.setBackgroundResource(R.drawable.circle)
            else -> {
                print("completed")
            }
        }
    }

    private fun findIndex(pinCode: Array<Int>, item: Int):Int {
        return pinCode.indexOf(item)
    }

}