package com.example.recursosyestilos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.ejercicios.ejercicio01.Ejercicio01Activity
import com.example.recursosyestilos.ejercicios.ejercicio02.Ejercicio02Activity
import com.example.recursosyestilos.ejercicios.ejercicio03.Ejercicio03Activity
import com.example.recursosyestilos.ejercicios.ejercicio04.Ejercicio04Activity
import com.example.recursosyestilos.ejercicios.ejercicio05.Ejercicio05Activity
import com.example.recursosyestilos.ejercicios.ejercicio06.Ejercicio06Activity
import com.example.recursosyestilos.ejercicios.ejercicio07.Ejercicio07Activity
import com.example.recursosyestilos.ejercicios.ejercicio08.Ejercicio08Activity
import com.example.recursosyestilos.ejercicios.ejercicio09.Ejercicio09Activity
import com.example.recursosyestilos.ejercicios.ejercicio10.Ejercicio10Activity
import com.example.recursosyestilos.ejercicios.ejercicio11.Ejercicio11Activity
import com.example.recursosyestilos.ejercicios.ejercicio12.Ejercicio12Activity
import com.example.recursosyestilos.ejercicios.ejercicio13.Ejercicio13Activity
import com.example.recursosyestilos.ejercicios.ejercicio14.Ejercicio14Activity
import com.example.recursosyestilos.ejercicios.ejercicio15.Ejercicio15Activity
import com.example.recursosyestilos.ejercicios.ejercicio16.Ejercicio16Activity
import com.example.recursosyestilos.ejercicios.ejercicio17.Ejercicio17Activity

/**
 * Menú Principal del Taller Android: Recursos y Estilos SENA
 * Conecta cada uno de los 17 ejercicios de forma independiente.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar navegaciones a cada ejercicio
        findViewById<Button>(R.id.btnEj01).setOnClickListener {
            startActivity(Intent(this, Ejercicio01Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj02).setOnClickListener {
            startActivity(Intent(this, Ejercicio02Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj03).setOnClickListener {
            startActivity(Intent(this, Ejercicio03Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj04).setOnClickListener {
            startActivity(Intent(this, Ejercicio04Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj05).setOnClickListener {
            startActivity(Intent(this, Ejercicio05Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj06).setOnClickListener {
            startActivity(Intent(this, Ejercicio06Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj07).setOnClickListener {
            startActivity(Intent(this, Ejercicio07Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj08).setOnClickListener {
            startActivity(Intent(this, Ejercicio08Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj09).setOnClickListener {
            startActivity(Intent(this, Ejercicio09Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj10).setOnClickListener {
            startActivity(Intent(this, Ejercicio10Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj11).setOnClickListener {
            startActivity(Intent(this, Ejercicio11Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj12).setOnClickListener {
            startActivity(Intent(this, Ejercicio12Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj13).setOnClickListener {
            startActivity(Intent(this, Ejercicio13Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj14).setOnClickListener {
            startActivity(Intent(this, Ejercicio14Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj15).setOnClickListener {
            startActivity(Intent(this, Ejercicio15Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj16).setOnClickListener {
            startActivity(Intent(this, Ejercicio16Activity::class.java))
        }
        findViewById<Button>(R.id.btnEj17).setOnClickListener {
            startActivity(Intent(this, Ejercicio17Activity::class.java))
        }
    }
}
