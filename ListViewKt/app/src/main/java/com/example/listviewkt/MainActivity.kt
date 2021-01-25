package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, " 정문규", "24", "안녕하세요"),
        User(R.drawable.android, " 정교원", "50", "집갈래요"),
        User(R.drawable.android, " 장진순", "50", "힘들어요"),
        User(R.drawable.android, " 정민규", "21", "턱이 아파요"),
        User(R.drawable.android, " 코틀린", "10", "어려워요"),
        User(R.drawable.android, " 파이선", "29", "반갑습니다")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val  item = arrayOf("사과", "배", "딸기", "키위", "정문규")
//        context란 한 액티비티의 모든 정보를 담고있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()

        }

    }
}