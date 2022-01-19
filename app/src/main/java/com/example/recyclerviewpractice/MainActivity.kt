package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoList = listOf(
            "宿題", "掃除",
            "選択", "メール",
            "読書", "アニメ見る",
            "Kotlinの勉強", "散歩",
            "📱買い替え", "ゲーム"
        )

        recyclerView = findViewById(R.id.RecyclerList)
        recyclerView.adapter = ToDoAdapter(todoList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val dividerItemDecoration =
            DividerItemDecoration(this , LinearLayoutManager(this).getOrientation())
        recyclerView.addItemDecoration(dividerItemDecoration)
    }
}