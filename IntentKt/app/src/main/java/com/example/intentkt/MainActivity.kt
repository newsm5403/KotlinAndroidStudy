package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_a.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
            intent.putExtra("msg", inputMsg.text.toString()) // HelloWorld라는 텍스트 값을 담은 뒤 msg라는 키로 잠궜다.
            startActivity(intent)
            finish() // 자기 자신 액티비티를 파괴한다.
        }
    }
}