package com.fullpagedeveloper.multipleviewrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.fullpagedeveloper.multipleviewrecyclerview.model.ModelItem

class MainActivity : AppCompatActivity() {

    private var postList: List<ModelItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listRecyclerView = findViewById<RecyclerView>(R.id.rv_id)
        val adapterRecyclerView = RecyclerViewAdapterMainActivity(postList)
        listRecyclerView.adapter = adapterRecyclerView
        postList.toMutableList().add()
    }
}