package com.example.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초 실행됬을 때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_title.setText("Hello World!")
    }
}
