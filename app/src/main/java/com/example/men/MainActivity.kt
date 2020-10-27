package com.example.men

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import comida.ComidaItemList
import comida.ComidaListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_opciones.*

class MainActivity : AppCompatActivity() {
    var aux=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnComida.setOnClickListener{
            //aux=1
            var intent = Intent(this, Opciones::class.java)
            intent.putExtra("aux", "comida")
            startActivity(intent)
        }
        btnBebida.setOnClickListener{
            aux=2
            var intent = Intent(this, Opciones::class.java)
            intent.putExtra("aux", "bebida")
            startActivity(intent)
        }
        btnPostre.setOnClickListener{
            aux=3
            var intent = Intent(this, Opciones::class.java)
            intent.putExtra("aux", "postre")
            startActivity(intent)
        }
    }

}
