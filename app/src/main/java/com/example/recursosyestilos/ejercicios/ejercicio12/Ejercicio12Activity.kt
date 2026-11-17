package com.example.recursosyestilos.ejercicios.ejercicio12

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 12 – Calculadora básica
 * Calculadora básica con botones del 0 al 9, +, -, *, /, = y C.
 * Utiliza el método onClick del layout para procesar la entrada.
 */
class Ejercicio12Activity : AppCompatActivity() {

    private lateinit var tvDisplay: TextView
    private var currentExpression = ""
    private var isNewOp = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_12)

        tvDisplay = findViewById(R.id.tvDisplay)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnBackMenu.setOnClickListener {
            finish()
        }
    }

    fun onCalcButtonClick(view: View) {
        if (view is Button) {
            val text = view.text.toString()
            when (text) {
                "C" -> {
                    currentExpression = ""
                    tvDisplay.text = "0"
                    isNewOp = true
                }
                "=" -> {
                    calculateResult()
                    isNewOp = true
                }
                "+", "-", "*", "/" -> {
                    if (currentExpression.isNotEmpty()) {
                        currentExpression += " $text "
                        tvDisplay.text = currentExpression
                        isNewOp = false
                    }
                }
                else -> {
                    if (isNewOp || tvDisplay.text == "0") {
                        currentExpression = text
                        isNewOp = false
                    } else {
                        currentExpression += text
                    }
                    tvDisplay.text = currentExpression
                }
            }
        }
    }

    private fun calculateResult() {
        try {
            val parts = currentExpression.split(" ")
            if (parts.size == 3) {
                val num1 = parts[0].toDouble()
                val op = parts[1]
                val num2 = parts[2].toDouble()

                val result = when (op) {
                    "+" -> num1 + num2
                    "-" -> num1 - num2
                    "*" -> num1 * num2
                    "/" -> if (num2 != 0.0) num1 / num2 else Double.NaN
                    else -> 0.0
                }

                if (result.isNaN()) {
                    tvDisplay.text = "Error"
                    currentExpression = ""
                } else {
                    val formattedResult = if (result % 1.0 == 0.0) result.toLong().toString() else result.toString()
                    tvDisplay.text = formattedResult
                    currentExpression = formattedResult
                }
            }
        } catch (e: Exception) {
            tvDisplay.text = "Error"
            currentExpression = ""
        }
    }
}
