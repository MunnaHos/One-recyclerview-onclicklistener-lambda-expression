package com.example.recyclerviewonclicklistenertonewactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val context:Context, private val images: List<Image>,
                   private val listener:(Image)->Unit):RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

                       class ImageViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                           private val imgeSrc:ImageView=itemView.findViewById(R.id.img)
                           private val name :TextView=itemView.findViewById(R.id.img_Name)

                           fun bindView(image: Image, listener:(Image) -> Unit){
                                imgeSrc.setImageResource(image.imageSrc)
                               name.text=image.imageTitle

                               itemView.setOnClickListener { listener(image) }
                           }

                       }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.item_image,parent,false)
        return ImageViewHolder(v)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position],listener)

    }

    override fun getItemCount(): Int {
        return images.size
    }
}