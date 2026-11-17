package com.example.recursosyestilos.ejercicios.ejercicio03

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 3 – Buttons
 * Demuestra el uso de estilos de botones y estados NORMAL, PRESSED y DISABLED.
 * Soporta internacionalización en español, inglés y francés.
 */
class Ejercicio03Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_03)

        val btnRaisedNormal = findViewById<Button>(R.id.btnRaisedNormal)
        val btnFlatNormal = findViewById<Button>(R.id.btnFlatNormal)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnRaisedNormal.setOnClickListener {
            Toast.makeText(this, "Raised Button Pulsado", Toast.LENGTH_SHORT).show()
        }
        btnFlatNormal.setOnClickListener {
            Toast.makeText(this, "Flat Button Pulsado", Toast.LENGTH_SHORT).show()
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
