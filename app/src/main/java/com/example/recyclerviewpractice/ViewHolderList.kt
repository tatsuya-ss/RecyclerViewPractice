package com.example.recyclerviewpractice

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderList(item: View): RecyclerView.ViewHolder(item) {
    val toDoList: TextView = item.findViewById(R.id.Text1)
}