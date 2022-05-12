package com.example.ders_recy

import android.widget.ImageView
import androidx.databinding.BindingAdapter

class DataBindingAdaptor {
    companion object{
        @JvmStatic @BindingAdapter("imageResource")
        fun setImageResource(imageView: ImageView,resource:Int)
        {
            imageView.setImageResource(resource)
        }
    }
}