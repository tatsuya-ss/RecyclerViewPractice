package com.example.recyclerviewpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter(private var list: List<String>): RecyclerView.Adapter<ViewHolderList>() {

    // レイアウト生成
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderList {
        // スタティックメソッドのfromを使ってインスタンス生成
        val inflater = LayoutInflater.from(parent.context)
        // inflateメソッドでXMLファイルから画面生成
        val view = inflater.inflate(R.layout.text_row_item, parent, false)
        return ViewHolderList(view)
    }

    // ViewHolderを結ぶ
    override fun onBindViewHolder(holder: ViewHolderList, position: Int) {
        holder.toDoList.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(list: List<String>) {
        this.list = list
    }

}