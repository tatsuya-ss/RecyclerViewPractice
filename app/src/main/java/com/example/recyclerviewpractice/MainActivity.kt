package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView

    var todoList = listOf(
        "宿題", "掃除",
        "選択", "メール",
        "読書", "アニメ見る",
        "Kotlinの勉強", "散歩",
        "📱買い替え", "ゲーム"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBinding()
        setupButton()
        setupRecyclerView()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.RecyclerList)
        recyclerView.adapter = ToDoAdapter(todoList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val dividerItemDecoration =
            DividerItemDecoration(this , LinearLayoutManager(this).getOrientation())
        recyclerView.addItemDecoration(dividerItemDecoration)
    }

    private fun setupButton() {
        binding.addButton.setOnClickListener {
            todoList += "サッカー"
            println(todoList)
            val adapter = recyclerView.adapter as ToDoAdapter
            adapter.setList(todoList)
            adapter.notifyDataSetChanged()
        }
    }

}