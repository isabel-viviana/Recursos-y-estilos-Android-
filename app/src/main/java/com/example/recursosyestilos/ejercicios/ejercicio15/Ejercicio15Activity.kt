package com.example.recursosyestilos.ejercicios.ejercicio15

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.recursosyestilos.R

/**
 * Ejercicio 15 – ViewPager2 vertical
 * Muestra páginas con colores de fondo diferentes mediante desplazamiento vertical.
 * viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
 */
class Ejercicio15Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_15)

        val viewPager = findViewById<ViewPager2>(R.id.viewPagerVertical)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        // Configurar orientación vertical
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        val pages = listOf(
            PageData("Página 1 (Rojo)", Color.parseColor("#FFCDD2")),
            PageData("Página 2 (Verde)", Color.parseColor("#C8E6C9")),
            PageData("Página 3 (Azul)", Color.parseColor("#BBDEFB"))
        )

        viewPager.adapter = VerticalPagerAdapter(pages)

        btnBackMenu.setOnClickListener {
            finish()
        }
    }

    data class PageData(val title: String, val color: Int)

    private class VerticalPagerAdapter(private val items: List<PageData>) :
        RecyclerView.Adapter<VerticalPagerAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val container: View = view.findViewById(R.id.pageContainer)
            val tvTitle: TextView = view.findViewById(R.id.tvPageTitle)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_page_15, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.tvTitle.text = item.title
            holder.container.setBackgroundColor(item.color)
        }

        override fun getItemCount(): Int = items.size
    }
}
