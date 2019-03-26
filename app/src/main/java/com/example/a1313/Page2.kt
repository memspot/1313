package com.example.a1313

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Page2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
    }

    fun ClickOk (view: View) {
        var intent: Intent = Intent(this, Page3::class.java)
        startActivity(intent)
    }
}
