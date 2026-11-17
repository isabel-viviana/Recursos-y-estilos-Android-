package com.example.recursosyestilos.ejercicios.ejercicio13

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.recursosyestilos.R
import kotlin.random.Random

/**
 * Ejercicio 13 – Cambiar color de fondo dinámicamente
 * Botones para cambiar el color de fondo a Rojo, Verde, Azul y Aleatorio.
 * Utiliza layout.setBackgroundColor(Color.rgb(r, g, b)).
 */
class Ejercicio13Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_13)

        val layout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        val btnRed = findViewById<Button>(R.id.btnRed)
        val btnGreen = findViewById<Button>(R.id.btnGreen)
        val btnBlue = findViewById<Button>(R.id.btnBlue)
        val btnRandom = findViewById<Button>(R.id.btnRandom)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnRed.setOnClickListener {
            layout.setBackgroundColor(Color.rgb(244, 67, 54))
        }

        btnGreen.setOnClickListener {
            layout.setBackgroundColor(Color.rgb(76, 175, 80))
        }

        btnBlue.setOnClickListener {
            layout.setBackgroundColor(Color.rgb(33, 150, 243))
        }

        btnRandom.setOnClickListener {
            val r = Random.nextInt(256)
            val g = Random.nextInt(256)
            val b = Random.nextInt(256)
            layout.setBackgroundColor(Color.rgb(r, g, b))
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
