package com.example.apppedidospro // Dejá TU paquete original aquí

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            // El Intent viaja de esta pantalla (this) a FormularioActivity
            val intent = Intent(this, FormularioActivity::class.java)
            startActivity(intent)
        }
    }
}