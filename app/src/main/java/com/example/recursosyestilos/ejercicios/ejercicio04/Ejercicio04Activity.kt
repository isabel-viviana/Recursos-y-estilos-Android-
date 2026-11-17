package com.example.recursosyestilos.ejercicios.ejercicio04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 4 – Two Activities
 * Simula una interfaz de chat/respuesta enviando y recibiendo mensajes entre 2 actividades.
 * Soporta multilenguaje (ES, EN, FR).
 */
class Ejercicio04Activity : AppCompatActivity() {

    private lateinit var tvReplyMessage: TextView
    private lateinit var etMessage: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_04)

        tvReplyMessage = findViewById(R.id.tvReplyMessage)
        etMessage = findViewById(R.id.etMessage)

        val btnSend = findViewById<Button>(R.id.btnSend)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnSend.setOnClickListener {
            val msg = etMessage.text.toString()
            val intent = Intent(this, Ejercicio04ReplyActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", msg)
            startActivityForResult(intent, REQUEST_CODE_REPLY)
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_REPLY && resultCode == RESULT_OK) {
            val reply = data?.getStringExtra("EXTRA_REPLY")
            if (!reply.isNullOrEmpty()) {
                tvReplyMessage.text = reply
            }
        }
    }

    companion object {
        private const val REQUEST_CODE_REPLY = 101
    }
}
