package com.example.pvnan.churrascore
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class Main : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botaofut.setOnClickListener() {
            val telafut = Intent ( this , Futebol::class.java)
            startActivity(telafut)
        }
        botaopebolim.setOnClickListener() {
            val telapebolim = Intent (this, Pebolim::class.java)
            startActivity(telapebolim)
        }
        botaotruco.setOnClickListener() {
            val telatruco = Intent (this, Truco::class.java)
            startActivity(telatruco)
        }
    }



}