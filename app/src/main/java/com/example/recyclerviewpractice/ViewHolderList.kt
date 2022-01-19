package com.example.recyclerviewpractice

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderList(cell: View): RecyclerView.ViewHolder(cell) {
    // 内部に配置されるText1のidをもつテキストビューの内容をメンバ変数として保持
    val toDoList: TextView = cell.findViewById(R.id.Text1)
}