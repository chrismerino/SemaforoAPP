package com.crismerino.semaforoapp

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var i: Int = 0
    lateinit var buttonInicio: Button
    lateinit var textViewStatus: TextView
    lateinit var mainLayout: LinearLayout
    private lateinit var mHandler: Handler
    private val mRunnable = object : Runnable{
        override fun run(){
            cambiosEnPantalla()
            mHandler.postDelayed(this, 5000)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonInicio = findViewById(R.id.button_Iniciar)
        textViewStatus = findViewById(R.id.textViewStatus)
        mainLayout = findViewById(R.id.mainLayout)

        mHandler = Handler(Looper.getMainLooper())

        buttonInicio.setOnClickListener {
            mRunnable.run()
        }
    }

    fun cambiosEnPantalla(){
        i = i+1
        for (j in 1..3){
            if (i == 1){
                mainLayout.setBackgroundColor(Color.GREEN)
                textViewStatus.text = "ADELANTE"
            } else if (i == 2){
                mainLayout.setBackgroundColor(Color.YELLOW)
                textViewStatus.text = "PRECAUCION"
            } else if (i == 3){
                mainLayout.setBackgroundColor(Color.RED)
                textViewStatus.text = "ALTO"
            } else if (i >= 4){
                i = 0
            }
        }
    }
}



