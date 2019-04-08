package com.example.a1313

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Page3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
    }

    fun ClickUmidade (view: View){
        var intent:Intent=Intent (this, PageUmidade::class.java)
        startActivity(intent)
    }

    fun ClickUV (view: View){
        var intent:Intent=Intent(this, PageUV::class.java)
        startActivity(intent)
    }

    fun ClickDicas (view: View) {
        var intent:Intent=Intent (this, PageDicas::class.java)
        startActivity(intent)
    }

    fun ClickConfig (view: View) {
        var intent:Intent=Intent ( this, Configuracoes::class.java)
        startActivity(intent)
    }
}
