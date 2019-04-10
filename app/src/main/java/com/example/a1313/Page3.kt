package com.example.a1313

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_page3.*

class Page3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)


        val i = intent
        recebeNome.text=i.getStringExtra("nomeJogador")
    }

    fun ClickDicas (view: View) {
        var intent:Intent=Intent (this, Dicas::class.java)
        startActivity(intent)
    }

    fun ClickConfig (view: View) {
        var intent:Intent=Intent ( this, Configuracoes::class.java)
        startActivity(intent)
    }
}
