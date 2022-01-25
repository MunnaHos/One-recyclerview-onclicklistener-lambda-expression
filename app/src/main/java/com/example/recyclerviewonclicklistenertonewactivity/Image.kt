package com.example.recyclerviewonclicklistenertonewactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image( val imageSrc:Int,
                  val imageTitle:String,
                  val imageDesc:String):Parcelable

val imageList = listOf<Image>(
Image(R.drawable.one,"Image 1","txt"),
Image(R.drawable.two,"Image 2","txt"),
Image(R.drawable.three,"Image 3","txt"),
Image(R.drawable.five,"Image 4","txt"),
Image(R.drawable.six,"Image 5","txt"),
Image(R.drawable.seven,"Image 6","txt"),
Image(R.drawable.eight,"Image 7","txt"),
Image(R.drawable.images,"Image 8","txt"),
Image(R.drawable.images,"Image 9","txt"),
Image(R.drawable.images,"Image 10","txt"),
)
