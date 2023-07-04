package com.example.bretalseries

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Mainadapter (var shows: Array <TVShow>): RecyclerView.Adapter<Mainadapter.Tvshowviewholder> () {

    class Tvshowviewholder (val cell: View): RecyclerView.ViewHolder (cell)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Tvshowviewholder {
        var cell: View = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
        return Tvshowviewholder(cell)
    }

    override fun getItemCount(): Int {
        return shows.size
    }

    override fun onBindViewHolder(holder: Tvshowviewholder, position: Int) {
        var show: TVShow = shows.get(position)
        var cell: View = holder.cell
        var textview: TextView = cell.findViewById(R.id.cell_tittle)
        textview.text = show.name
        var textview1: TextView = cell.findViewById(R.id.cell_text)
        textview1.text = show.overview

    }


}