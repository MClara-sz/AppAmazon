package com.example.appamazon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class Detalhes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)
        setSupportActionBar(findViewById(R.id.toolbar))

        //recebr via intent os val. da tela pai
        val orig_img  = intent.getIntExtra("img", 0)
        val orig_sinp = intent.getStringExtra("sinopse")
        val orig_tit = intent.getStringExtra("titulo")
        val orig_ficha = intent.getStringExtra("ficha")

        // val titulo  = intent.getIntExtra("titulo", 0)


        //Toast.makeText(this, "$orig_img", LENGTH_SHORT).show()
        val imgView = findViewById<ImageView>(R.id.detImg)
        imgView.setImageResource(orig_img)

       // Toast.makeText(this, "$orig_sinp", LENGTH_SHORT).show()
        val sinopse = findViewById<TextView>(R.id.textView2)
        sinopse.setText(orig_sinp)

        val titulo = findViewById<TextView>(R.id.tvTitulo)
        titulo.setText(orig_tit)

        val ficha = findViewById<TextView>(R.id.textView3)
        ficha.setText(orig_ficha)

        //criar as variaveis locais locais dos widgets
         //val det_titulo = findViewById<TextView>(R.id.tvTitulo)

    }
}