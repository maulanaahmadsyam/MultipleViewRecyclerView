package com.fullpagedeveloper.multipleviewrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fullpagedeveloper.multipleviewrecyclerview.model.ModelItem
import kotlinx.android.synthetic.main.simple_list_item_1.view.*

class RecyclerViewAdapterMainActivity(private val mData: List<ModelItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class ToViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder{
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            1 -> MyViewHolder(inflater.inflate(R.layout.simple_list_item_1, null))
            else -> ToViewHolder(inflater.inflate(R.layout.simple_list_item_2, null))
        }
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = mData[position]
        if (item.isRow) {
            val h = holder as MyViewHolder
            h.itemView.txv1.text = "tessss"
        } else {
            val x = holder as ToViewHolder
            x.itemView.txv1.text = "taeee"
        }
    }

    override fun getItemViewType(position: Int): Int {
        var pos = 0
        for (i in mData){
            pos = if(i.isRow){
                1
            }else{
                2
            }
        }
        return pos
    }
}