package com.smartherd.sandeep.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        buttonShowToast.setOnClickListener {
            Log.i("Main Activity", "ButtonClicked")

            Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()
        }
    }
}
//what to do from here on take3