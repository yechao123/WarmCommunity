package com.xueyu.warmcommunity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xueyu.warmlibrary.LogUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_main.setOnClickListener {
            LogUtils.a()
        }
    }
}