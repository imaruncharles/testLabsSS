package com.in22labs.myapplication.ui.ui.inspection.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.in22labs.myapplication.R
import com.in22labs.myapplication.model.InspectionData
import kotlin.random.Random

class SubHeadingAdapter(val mutableList: MutableList<InspectionData>) : RecyclerView.Adapter<SubHeadingAdapter.VHolder>() {


    inner class VHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val subHeadingTextView  = itemView.findViewById<AppCompatTextView>(R.id.subHedText)
        val progressBar = itemView.findViewById<ProgressBar>(R.id.progressBarSubHead)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {
        return VHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_cci_sub_heading_view,parent,false))
    }

    override fun getItemCount(): Int {
       return mutableList.size
    }

    override fun onBindViewHolder(holder: VHolder, position: Int) {
        holder.subHeadingTextView.text = mutableList[position].heading
        holder.progressBar.progress = Random.nextInt(0,100)
    }
}