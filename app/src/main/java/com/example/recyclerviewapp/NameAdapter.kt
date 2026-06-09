package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameAdapter(
    private val names: List<String>,
    private val onItemClick: (String) -> Unit
) :
    RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameText: TextView = itemView.findViewById(R.id.nameText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_name, parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val name = names[position]
        holder.nameText.text = name

        holder.itemView.setOnClickListener {
            onItemClick(name)
        }
    }

    override fun getItemCount(): Int {
        return names.size
    }
}