package com.john.tema2.tarea1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.john.tema2.R

class ActividadPrincipal : AppCompatActivity() {
    private lateinit var boton : Button
    private lateinit var imgView1 : ImageView
    private lateinit var imgView2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_principal)
        initEvent()
    }

    private fun initEvent() {
        boton = findViewById(R.id.boton_saltar)
        imgView1 = findViewById(R.id.imagen_background)
        imgView2 = findViewById(R.id.imagen_estadistica)


        boton.setOnClickListener {
            intent = Intent(this, Actividad2::class.java).apply {
            }
            startActivity(intent)
        }
        imgView1.setOnClickListener {
            intent = Intent(this, Actividad3::class.java).apply {
            }
            startActivity(intent)
        }
        imgView2.setOnClickListener {
            intent = Intent(this, Actividad4::class.java).apply {
            }
            startActivity(intent)
        }
    }
}