package com.netbazaar.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.netbazaar.R
import kotlinx.android.synthetic.main.activity_select_option.*

class SelectOptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_option)

        btnTable.setOnClickListener {
            val intent = Intent(this@SelectOptionActivity, TablesActivity::class.java)
            startActivityForResult(intent,100)
        }
    }
}