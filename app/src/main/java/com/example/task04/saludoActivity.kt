package com.example.task04
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class saludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)
        //Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")
        //Construimos el mensaje a mostrar
        txtSaludo.text = "Buenas $saludo ¿Sabias que Xavier Foster fue el único en marcar a Hector Helio el solito? \uD83C\uDF20 "
    }
}