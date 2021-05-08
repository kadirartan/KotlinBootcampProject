package com.example.kotlinbootcampprojectv11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class BeginingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begining)

        val exampleList = generateDummyList(500)

        /*recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)*/
    }

    private fun generateDummyList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_baseline_apartment_24
                1 -> R.drawable.ic_baseline_article_24
                else -> R.drawable.ic_baseline_contact_support_24
            }
            val item = ExampleItem(drawable, "Item $i", "Line2")
            list += item
        }
        return list
    }
}