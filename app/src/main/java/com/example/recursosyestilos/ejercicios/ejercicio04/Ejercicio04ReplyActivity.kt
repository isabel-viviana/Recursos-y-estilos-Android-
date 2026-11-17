package com.example.recursosyestilos.ejercicios.ejercicio04

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Actividad secundaria para el Ejercicio 4.
 * Recibe un mensaje y devuelve la respuesta a la actividad principal.
 */
class Ejercicio04ReplyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_04_reply)

        val tvReceivedMessage = findViewById<TextView>(R.id.tvReceivedMessage)
        val etReplyMessage = findViewById<EditText>(R.id.etReplyMessage)
        val btnSendReply = findViewById<Button>(R.id.btnSendReply)

        val receivedMsg = intent.getStringExtra("EXTRA_MESSAGE")
        tvReceivedMessage.text = receivedMsg ?: "Sin mensaje"

        btnSendReply.setOnClickListener {
            val replyText = etReplyMessage.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("EXTRA_REPLY", replyText)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}
