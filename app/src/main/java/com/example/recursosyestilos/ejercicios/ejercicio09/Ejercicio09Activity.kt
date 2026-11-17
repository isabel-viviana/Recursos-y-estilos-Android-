package com.example.recursosyestilos.ejercicios.ejercicio09

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 9 – Cuadrícula de botones
 * Reproduce una cuadrícula de 6 botones de colores con iconos.
 */
class Ejercicio09Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_09)

        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)
        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
