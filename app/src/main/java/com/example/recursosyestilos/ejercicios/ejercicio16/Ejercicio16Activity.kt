package com.example.recursosyestilos.ejercicios.ejercicio16

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.recursosyestilos.R

/**
 * Ejercicio 16 – ViewPager2 con imágenes
 * Muestra 3 imágenes con swipe de navegación utilizando ViewPager2.
 */
class Ejercicio16Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_16)

        val viewPager = findViewById<ViewPager2>(R.id.viewPagerImages)
        val btnBackMenu = findViewById<Button>(R.id.btnBackMenu)

        val imagePages = listOf(
            ImageData("Imagen 1 - Triángulo Azul", R.drawable.img_sample1),
            ImageData("Imagen 2 - Círculo Verde", R.drawable.img_sample2),
            ImageData("Imagen 3 - Cuadrado Naranja", R.drawable.img_sample3)
        )

        viewPager.adapter = ImagePagerAdapter(imagePages)

        btnBackMenu.setOnClickListener {
            finish()
        }
    }

    data class ImageData(val title: String, val imageRes: Int)

    private class ImagePagerAdapter(private val items: List<ImageData>) :
        RecyclerView.Adapter<ImagePagerAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val ivImage: ImageView = view.findViewById(R.id.ivPageImage)
            val tvTitle: TextView = view.findViewById(R.id.tvImageTitle)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_page_16, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.tvTitle.text = item.title
            holder.ivImage.setImageResource(item.imageRes)
        }

        override fun getItemCount(): Int = items.size
    }
}
