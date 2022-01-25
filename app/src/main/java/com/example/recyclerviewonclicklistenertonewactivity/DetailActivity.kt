package com.example.recyclerviewonclicklistenertonewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgSrc:ImageView =findViewById(R.id.imageView)
        val title:TextView=findViewById(R.id.textView)
        val imgDesc:TextView=findViewById(R.id.textView2)

        val image = intent.getParcelableExtra<Image>(MainActivity.INTENT_PARCELABLE)

        if (image != null) {
            imgSrc.setImageResource(image.imageSrc)
        }

        title.text= image?.imageTitle
        imgDesc.text= image?.imageDesc


    }
}