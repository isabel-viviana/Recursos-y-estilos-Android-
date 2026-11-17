package com.example.recursosyestilos.ejercicios.ejercicio14

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 14 – Encuesta interactiva
 * Grupo de RadioButton para encuesta. Al pulsar "Enviar" muestra Toast con la opción o advertencia si no seleccionó.
 */
class Ejercicio14Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_14)

        val rgSurvey = findViewById<RadioGroup>(R.id.rgSurvey)
        val btnSubmitSurvey = findViewById<Button>(R.id.btnSubmitSurvey)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnSubmitSurvey.setOnClickListener {
            val selectedId = rgSurvey.checkedRadioButtonId
            if (selectedId == -1) {
                Toast.makeText(this, getString(R.string.ej14_warn), Toast.LENGTH_SHORT).show()
            } else {
                val radioButton = findViewById<RadioButton>(selectedId)
                val optionText = radioButton.text.toString()
                Toast.makeText(this, "Seleccionaste: $optionText", Toast.LENGTH_SHORT).show()
            }
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }
}
