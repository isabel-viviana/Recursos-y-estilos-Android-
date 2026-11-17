package com.example.recursosyestilos.ejercicios.ejercicio08

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 8 – CardView App
 * Muestra tarjetas estilizadas para Call, Chat, Comment y Duo.
 */
class Ejercicio08Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_08)

        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)
        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
