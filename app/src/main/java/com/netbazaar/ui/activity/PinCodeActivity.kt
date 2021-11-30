package com.netbazaar.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.netbazaar.R
import kotlinx.android.synthetic.main.activity_pin_code.*

class PinCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_code)

        mEnter.setOnClickListener {
            val intent = Intent(this@PinCodeActivity, SelectOptionActivity::class.java)
            startActivityForResult(intent,100)
        }

    }
}