package com.example.recursosyestilos.ejercicios.ejercicio01

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 1 – Landscape design
 * Demuestra la adaptación de la interfaz a orientación vertical u horizontal mediante recursos de layout.
 */
class Ejercicio01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_01)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btn1.setOnClickListener {
            Toast.makeText(this, "Presionado Button 1", Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            Toast.makeText(this, "Presionado Button 2", Toast.LENGTH_SHORT).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this, "Presionado Button 3", Toast.LENGTH_SHORT).show()
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
