package com.example.recursosyestilos.ejercicios.ejercicio05

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 5 – Home
 * Pantalla principal de navegación básica con dos botones e icono de inicio.
 * Soporta multilenguaje (ES, EN, FR).
 */
class Ejercicio05Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_05)

        val btnNavDest = findViewById<Button>(R.id.btnNavDest)
        val btnNavAction = findViewById<Button>(R.id.btnNavAction)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnNavDest.setOnClickListener {
            Toast.makeText(this, "Navegar a destino", Toast.LENGTH_SHORT).show()
        }

        btnNavAction.setOnClickListener {
            Toast.makeText(this, "Navegar con acción", Toast.LENGTH_SHORT).show()
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
