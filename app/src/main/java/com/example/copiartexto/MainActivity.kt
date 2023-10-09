package com.example.copiartexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.copiartexto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding= ActivityMainBinding.inflate(layoutInflater)

            setContentView(binding.root)


        binding.boton.setOnClickListener{
            binding.textView.text = "Hola " + binding.Texto.text.toString()
            Toast.makeText(this,binding.Texto.text.toString(), Toast.LENGTH_LONG).show()
        }

        binding.reset.setOnClickListener{
            binding.Texto.text.clear()
            binding.textView.text=""
        }
/*
        //REFERNCIA AL BOTON
        var btn= findViewById<Button>(R.id.boton)
        
        // REFERENCIA AL CUADRO TEXTO
        var texto=findViewById<EditText>(R.id.Texto)

        // REFERENCIA AL CUADRO DE SALUDO
        var saludo= findViewById<TextView>(R.id.textView)

        // REFERNCIA AL BOTON RESET
        var limpiar= findViewById<Button>(R.id.reset)

        btn.setOnClickListener{
            saludo.text = "Hola, " +texto.text.toString()
        }

        limpiar.setOnClickListener{
            texto.text.clear()
            saludo.text=""
        }
        */

    }
}