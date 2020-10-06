package com.fullpagedeveloper.multipleviewrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.fullpagedeveloper.multipleviewrecyclerview.model.SectionRows

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemaja = ArrayList<SectionRows>()

        val listRecyclerView = findViewById<RecyclerView>(R.id.rv_id)
        val adapterRecyclerView = RecyclerViewAdapterMainActivity(itemaja)
        listRecyclerView.adapter = adapterRecyclerView
    }
}