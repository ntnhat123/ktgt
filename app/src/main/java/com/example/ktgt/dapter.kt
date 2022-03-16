package com.example.ktgt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class dapter(private val newlist:List<data>) : RecyclerView.Adapter<dapter.ViewHolder>() {

    inner class ViewHolder(item : View) : RecyclerView.ViewHolder(item){
        val name = item.findViewById<TextView>(R.id.name)
        val phone = item.findViewById<TextView>(R.id.phone)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = newlist[position]
        holder.name.text = data.name
        holder.phone.text = data.phone
    }

    override fun getItemCount(): Int {
        return newlist.size
    }

}