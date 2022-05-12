package com.example.ders_recy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ders_recy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnClickHandlerInterface {
    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var onClickHandlerInterface: OnClickHandlerInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val list=ArrayList<ClothesModel>()
        list.add(ClothesModel("Fit and Flare","$120.99",R.drawable.clothes1))
        list.add(ClothesModel("Empire Dress","$136",R.drawable.clothes2))
        list.add(ClothesModel("Summer Vibes","$199.99",R.drawable.clothes3))
        list.add(ClothesModel("Flora Fun","$150.99",R.drawable.clothes4))

        onClickHandlerInterface=this
        val adapter=ClothesAdapter(list,onClickHandlerInterface)
        val gridLayoutManager=GridLayoutManager(this,2)
        activityMainBinding.recyclerView.layoutManager=gridLayoutManager
        activityMainBinding.setVariable(BR.adapter,adapter)
    }

    override fun onClick(view: View, position: Int) {
        //tıklandıgında tetiklenecek
        when(view.id){
            R.id.clothes_button -> {
                Toast.makeText(this,"TIKLANDI - ${position}",Toast.LENGTH_LONG).show()
            }
        }
    }
}