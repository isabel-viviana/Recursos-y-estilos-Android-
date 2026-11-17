package com.example.recursosyestilos.ejercicios.ejercicio10

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 10 – Contador de clics
 * Cada vez que se pulsa el botón, el TextView muestra el número de veces que se ha pulsado.
 */
class Ejercicio10Activity : AppCompatActivity() {

    private var clickCount = 0
    private lateinit var tvCounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_10)

        tvCounter = findViewById(R.id.tvCounter)
        val btnIncrement = findViewById<Button>(R.id.btnIncrement)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnIncrement.setOnClickListener {
            clickCount++
            tvCounter.text = "Número de clics: $clickCount"
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
