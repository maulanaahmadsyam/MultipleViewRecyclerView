package com.fullpagedeveloper.multipleviewrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fullpagedeveloper.multipleviewrecyclerview.model.ModelItem
import kotlinx.android.synthetic.main.simple_list_item_1.view.*
import kotlinx.android.synthetic.main.simple_list_item_2.view.*

private const val TYPE = 0
private const val ITEM = 1

class RecyclerViewAdapterMainActivity(var mData: List<ModelItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(postModel: ModelItem){
            itemView.txv_provider_name.text = postModel.title
        }
    }

    class ToViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(postModel: ModelItem){
            itemView.txv_Type.text = postModel.postType.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder{
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ITEM -> MyViewHolder(inflater.inflate(R.layout.simple_list_item_1, null))
            else -> ToViewHolder(inflater.inflate(R.layout.simple_list_item_2, null))
        }
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //val item = mData[position]
        if (getItemViewType(position) == TYPE){
            (holder as MyViewHolder).bind(mData[position])
        } else {
            (holder as ToViewHolder).bind(mData[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (mData[position].postType == 0L){
            TYPE
        } else {
            ITEM
        }
    }
}