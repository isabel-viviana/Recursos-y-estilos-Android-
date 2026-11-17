package com.example.recursosyestilos.ejercicios.ejercicio06

import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 6 – Radio Button Tutorial
 * Muestra el diseño exacto de la guía con la pregunta "¿Cuál es la montaña más alta del mundo?"
 * y las 4 opciones de RadioButton (Matterhorn, Mount Olympus, Mount Everest, Mount Fuji).
 * Soporta multilenguaje (ES, EN, FR).
 */
class Ejercicio06Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_06)

        val rgMountains = findViewById<RadioGroup>(R.id.rgMountains)
        val btnSubmitAnswer = findViewById<Button>(R.id.btnSubmitAnswer)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnSubmitAnswer.setOnClickListener {
            val selectedId = rgMountains.checkedRadioButtonId
            if (selectedId == -1) {
                Toast.makeText(this, getString(R.string.ej06_select_option), Toast.LENGTH_SHORT).show()
            } else if (selectedId == R.id.rbEverest) {
                Toast.makeText(this, getString(R.string.ej06_correct), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.ej06_incorrect), Toast.LENGTH_SHORT).show()
            }
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
