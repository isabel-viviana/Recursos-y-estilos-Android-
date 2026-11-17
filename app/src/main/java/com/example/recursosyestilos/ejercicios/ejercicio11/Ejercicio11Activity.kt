package com.example.recursosyestilos.ejercicios.ejercicio11

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 11 – Activar/Desactivar un CheckBox
 * Al pulsar el botón se invierte el estado del CheckBox.
 */
class Ejercicio11Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_11)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val btnToggle = findViewById<Button>(R.id.btnToggle)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnToggle.setOnClickListener {
            checkBox.isChecked = !checkBox.isChecked
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
