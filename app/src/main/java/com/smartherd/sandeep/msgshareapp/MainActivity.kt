package com.smartherd.sandeep.msgshareapp

import android.content.Intent
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

       btnSendMsgToNextActivity.setOnClickListener {
           var message: String = editUserMsg.text.toString()
           Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

           val intent = Intent(this,SecondActivity::class.java)//parameters of Intent(first_activity, second_Activity) //this,SecondActivity(java file)
           startActivity(intent)

       }
    }
}
//what to do from here on take3