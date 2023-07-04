package com.example.bretalseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ir buscar célula pelo ID
        val cell: View = findViewById(R.id.activity_main_cell)

        // Ir buscar componentes visuais à célula através do ID
        val image: ImageView = cell.findViewById(R.id.cell_image)
        val title: TextView = cell.findViewById(R.id.cell_title)
        val description: TextView = cell.findViewById(R.id.cell_description)

        // Mudar propriedades dos componentes
        image.setImageResource(R.drawable.ic_launcher_foreground)
        title.setText(R.string.cell_title)
        description.setText(R.string.cell_description)
    }
}