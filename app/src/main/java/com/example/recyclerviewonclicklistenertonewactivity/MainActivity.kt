package com.example.recyclerviewonclicklistenertonewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler = findViewById<RecyclerView>(R.id.imageRecycleView)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.setHasFixedSize(true)

        recycler.adapter =ImageAdapter(this, imageList){

            val intent= Intent(this,DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)

        }
    }
}