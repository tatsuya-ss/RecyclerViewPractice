package com.example.recyclerviewpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter(private val list: List<String>): RecyclerView.Adapter<ViewHolderList>() {

    // レイアウト生成
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderList {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.text_row_item, parent, false
        )
        return ViewHolderList(itemView)
    }

    // ViewHolderを結ぶ
    override fun onBindViewHolder(holder: ViewHolderList, position: Int) {
        holder.toDoList.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

}