package com.example.recursosyestilos.ejercicios.ejercicio02

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R
import java.util.Locale

/**
 * Ejercicio 2 – ChangeMaker (thollererChangeMaker)
 * Muestra el diseño exacto de la guía con desglose en billetes y monedas según el teclado ingresado.
 */
class Ejercicio02Activity : AppCompatActivity() {

    private var amountInCents: Int = 234

    private lateinit var tvPrice: TextView
    private lateinit var tv20: TextView
    private lateinit var tv10: TextView
    private lateinit var tv5: TextView
    private lateinit var tv1: TextView
    private lateinit var tv25c: TextView
    private lateinit var tv10c: TextView
    private lateinit var tv5c: TextView
    private lateinit var tv1c: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_02)

        tvPrice = findViewById(R.id.tvPrice)
        tv20 = findViewById(R.id.tv20)
        tv10 = findViewById(R.id.tv10)
        tv5 = findViewById(R.id.tv5)
        tv1 = findViewById(R.id.tv1)
        tv25c = findViewById(R.id.tv25c)
        tv10c = findViewById(R.id.tv10c)
        tv5c = findViewById(R.id.tv5c)
        tv1c = findViewById(R.id.tv1c)

        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)
        val btnClear = findViewById<Button>(R.id.btnClear)

        val numButtons = listOf(
            R.id.btn0 to 0, R.id.btn1 to 1, R.id.btn2 to 2, R.id.btn3 to 3, R.id.btn4 to 4,
            R.id.btn5 to 5, R.id.btn6 to 6, R.id.btn7 to 7, R.id.btn8 to 8, R.id.btn9 to 9
        )

        for ((id, digit) in numButtons) {
            findViewById<Button>(id)?.setOnClickListener {
                if (amountInCents < 99999) {
                    amountInCents = amountInCents * 10 + digit
                    updateUI()
                }
            }
        }

        btnClear?.setOnClickListener {
            amountInCents = 0
            updateUI()
        }

        btnBackMenu?.setOnClickListener {
            finish()
        }

        updateUI()
    }

    private fun updateUI() {
        val priceVal = amountInCents / 100.0
        tvPrice.text = String.format(Locale.US, "Price: %.2f", priceVal)

        var rem = amountInCents
        val c20 = rem / 2000; rem %= 2000
        val c10 = rem / 1000; rem %= 1000
        val c5 = rem / 500; rem %= 500
        val c1 = rem / 100; rem %= 100
        val c25c = rem / 25; rem %= 25
        val c10c = rem / 10; rem %= 10
        val c5c = rem / 5; rem %= 5
        val c1c = rem

        tv20.text = "$20: $c20"
        tv10.text = "$10: $c10"
        tv5.text = " $5: $c5"
        tv1.text = " $1: $c1"
        tv25c.text = "25¢: $c25c"
        tv10c.text = "10¢: $c10c"
        tv5c.text = " 5¢: $c5c"
        tv1c.text = " 1¢: $c1c"
    }
}
