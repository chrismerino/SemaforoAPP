package com.crismerino.semaforoapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // CREAR VARIABLES

        val accionButton = findViewById<Button>(R.id.button_Iniciar)
        val textViewTitulo = findViewById<TextView>(R.id.textView_Titulo)
        val mainLayout = findViewById<ConstraintLayout>(R.id.mainLayout_Background)



        // INSTANCIAR EL BOTON

        accionButton.setOnClickListener {
            accionButton.text = getString(R.string.text_ButtonParar)
            textViewTitulo.text = getString(R.string.text_Adelante)
            mainLayout.setBackgroundColor(Color.parseColor("#00E05E"))
        }

        // if


    }


}
