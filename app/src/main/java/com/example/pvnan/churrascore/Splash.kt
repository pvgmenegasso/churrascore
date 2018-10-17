package com.example.pvnan.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*


class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        GlideApp.with(this)
                .load("https://theequiaticbind.files.wordpress.com/2014/05/120806-yakiniku1.gif")
                .placeholder(R.mipmap.ic_launcher)
                .into(imgLogoApp)


        Handler().postDelayed({
            val listaContatinhos = Intent(this, Main::class.java)
            startActivity(listaContatinhos)
            finish()
        }, 4000)

    }
}
