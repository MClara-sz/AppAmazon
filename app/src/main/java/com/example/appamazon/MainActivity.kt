package com.example.appamazon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgView1 = findViewById<ImageView>(R.id.imgView1)
        //val imgView2 = findViewById<ImageView>(R.id.tv002)


        imgView1.setOnClickListener{

           val intent: Intent = Intent (this,Detalhes::class.java).apply {
               val sinopse = "A história gira em torno de uma batalha entre os Sete Reinos, onde duas famílias dominantes estão lutando pelo controle do Trono de Ferro, cuja posse possivelmente assegurará a sobrevivência durante o inverno que está por vir. Produção da HBO, Game of Thrones é exibida simultaneamente nos EUA e no Brasil."
               val ficha = "Título\tGame of Thrones (Season 1) (Original)\n" +
                       "Ano produção\t2011\n" +
                       "Dirigido por\tAlan Taylor (I) Brian Kirk Daniel Minahan Timothy Van Patten\n" +
                       "Estreia\t\n" +
                       "17 de Abril de 2011 ( Mundial )\n" +
                       "Outras datas \n" +
                       "Duração\t557 minutos\n" +
                       "Classificação\t 16 - Não recomendado para menores de 16 anos\n" +
                       "Gênero\t\n" +
                       "Aventura Drama Fantasia\n" +
                       "Países de Origem\t\n"
                       "Estados Unidos da América"


               putExtra("img",R.drawable.got)

               putExtra("sinopse", sinopse)

               putExtra("titulo", "Game Of Thrones")

               putExtra("ficha", ficha)

               //putExtra("img", img)

               //putExtra("img", img)

           }
           Toast.makeText(this, "clicou imagem 1", LENGTH_SHORT).show()
           startActivity(intent)

       }
/*
        imgView2.setOnClickListener{
            val img= imgView1.id
            val intent: Intent = Intent (this,Detalhes2::class.java).apply {
                putExtra("img", img)

                //putExtra("img", img)

                //putExtra("img", img)

                //putExtra("img", img)

                //putExtra("img", img)

                //putExtra("img", img)

            }
            Toast.makeText(this, "clicou imagem 1", LENGTH_SHORT).show()
            startActivity(intent)

        }*/
    }
}