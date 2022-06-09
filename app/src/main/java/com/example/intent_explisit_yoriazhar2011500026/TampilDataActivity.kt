package com.example.intent_explisit_yoriazhar2011500026

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TampilDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil_data)

        val tvData = findViewById<TextView>(R.id.tvData)
        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("Nama")

        tvData.text = """"
            Data yang dimasukan :
            NIM : $nim
            Nama: $nama
            """.trimIndent()
    }
}