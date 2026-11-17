package com.example.recursosyestilos.ejercicios.ejercicio17

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 17 – Theming Material Design Buttons
 * Muestra botones Contained, Outlined y Text Button aplicando estilos Material.
 */
class Ejercicio17Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_17)

        val btnContained = findViewById<Button>(R.id.btnContained)
        val btnOutlined = findViewById<Button>(R.id.btnOutlined)
        val btnText = findViewById<Button>(R.id.btnText)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnContained.setOnClickListener {
            Toast.makeText(this, "Contained Button Pulsado", Toast.LENGTH_SHORT).show()
        }
        btnOutlined.setOnClickListener {
            Toast.makeText(this, "Outlined Button Pulsado", Toast.LENGTH_SHORT).show()
        }
        btnText.setOnClickListener {
            Toast.makeText(this, "Text Button Pulsado", Toast.LENGTH_SHORT).show()
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
