package com.example.recursosyestilos.ejercicios.ejercicio07

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recursosyestilos.R

/**
 * Ejercicio 7 – RoomDemo
 * Interfaz con Product ID, Product Name, Product Quantity y botones ADD, DELETE, FIND.
 * Mantiene una lista en memoria de productos.
 * Soporta multilenguaje (ES, EN, FR).
 */
class Ejercicio07Activity : AppCompatActivity() {

    private val productList = mutableListOf<Product>()

    private lateinit var etProductId: EditText
    private lateinit var etProductName: EditText
    private lateinit var etProductQty: EditText
    private lateinit var tvProductList: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_07)

        etProductId = findViewById(R.id.etProductId)
        etProductName = findViewById(R.id.etProductName)
        etProductQty = findViewById(R.id.etProductQty)
        tvProductList = findViewById(R.id.tvProductList)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnDelete = findViewById<Button>(R.id.btnDelete)
        val btnFind = findViewById<Button>(R.id.btnFind)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        btnAdd.setOnClickListener {
            val id = etProductId.text.toString()
            val name = etProductName.text.toString()
            val qty = etProductQty.text.toString()

            if (id.isNotEmpty() && name.isNotEmpty() && qty.isNotEmpty()) {
                productList.add(Product(id, name, qty))
                updateListDisplay()
                clearInputs()
                Toast.makeText(this, "Producto añadido", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        btnDelete.setOnClickListener {
            val id = etProductId.text.toString()
            val removed = productList.removeAll { it.id == id }
            if (removed) {
                updateListDisplay()
                clearInputs()
                Toast.makeText(this, "Producto eliminado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Producto no encontrado", Toast.LENGTH_SHORT).show()
            }
        }

        btnFind.setOnClickListener {
            val id = etProductId.text.toString()
            val found = productList.find { it.id == id }
            if (found != null) {
                etProductName.setText(found.name)
                etProductQty.setText(found.qty)
                Toast.makeText(this, "Producto encontrado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Producto no encontrado", Toast.LENGTH_SHORT).show()
            }
        }

        btnBackMenu.setOnClickListener {
            finish()
        }
    }

    private fun updateListDisplay() {
        if (productList.isEmpty()) {
            tvProductList.text = "Lista de productos vacía"
        } else {
            val sb = StringBuilder("Productos almacenados:\n")
            for (p in productList) {
                sb.append("ID: ").append(p.id).append(" | Nombre: ").append(p.name).append(" | Cantidad: ").append(p.qty).append("\n")
            }
            tvProductList.text = sb.toString()
        }
    }

    private fun clearInputs() {
        etProductId.text.clear()
        etProductName.text.clear()
        etProductQty.text.clear()
    }

    data class Product(val id: String, val name: String, val qty: String)
}
