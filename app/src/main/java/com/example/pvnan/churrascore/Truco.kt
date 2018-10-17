package com.example.pvnan.churrascore

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.android.synthetic.main.activity_truco.*
import kotlinx.android.synthetic.main.popup.*

class Truco : AppCompatActivity() {

    var pontos1 = 0
    var pontos2 = 0
    var vitorias1 = 0
    var vitorias2 = 0
    var esquerda = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_truco)
        cincot.setText(pontos1.toString())
        um.setText(pontos2.toString())


        cincot.setOnClickListener()
        {
            cincot.setBackgroundColor(Color.CYAN)
            esquerda = true
            um.setBackgroundColor(Color.WHITE)
        }
        um.setOnClickListener()
        {
            um.setBackgroundColor(Color.CYAN)
            esquerda = false
            cincot.setBackgroundColor(Color.WHITE)
        }
        botao1t.setOnClickListener() {
            if (esquerda == true) {
                        pontos1++
                        cincot . setText (pontos1.toString())
            }
            else
            {
                        pontos2++
                        um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
        }
        botaot.setOnClickListener() {
            if(esquerda == true) {
                pontos1--
                cincot.setText(pontos1.toString())
            }
            else
            {
                pontos2--
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
        }
        botao3.setOnClickListener()
        {
            if(esquerda == true) {
                pontos1 = pontos1 + 3
                cincot.setText(pontos1.toString())
            }
            else
            {
                pontos2 = pontos2 + 3
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()

            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
        }
        botao6.setOnClickListener()
        {
            if(esquerda == true) {
                pontos1 = pontos1 + 6
                cincot.setText(pontos1.toString())
            }
            else
            {
                pontos2 = pontos2 + 6
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
        }
        botao9.setOnClickListener()
        {
            if(esquerda == true) {
                pontos1 = pontos1 + 9
                cincot.setText(pontos1.toString())
            }
            else
            {
                pontos2 = pontos2 + 9
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
        }
        botao12.setOnClickListener()
        {
            if(esquerda == true)
            {
            pontos1 = pontos1 + 12
            cincot.setText(pontos1.toString())}
            else
            {
                pontos2 = pontos2 + 12
                um.setText(pontos2.toString())
            }
            if(pontos1 >= 12)
            {
                vitorias1++
                vitorias.setText("vitórias:"+vitorias1.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
            if(pontos2 >= 12)
            {
                vitorias2++
                vit.setText("vitórias:"+vitorias2.toString())
                pontos1 = 0
                pontos2 = 0
                cincot . setText (pontos1.toString())
                um.setText(pontos2.toString())
                mostrapopup()
            }
        }
    }
    fun mostrapopup()
    {
        val inflater:LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popup = inflater.inflate(R.layout.popup, null)
        val popupWindow = PopupWindow(
            popup,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        )
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            popupWindow.elevation = 10.0F
        }
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            // Create a new slide animation for popup window enter transition
            val slideIn = Slide()
            slideIn.slideEdge = Gravity.TOP
            popupWindow.enterTransition = slideIn

            // Slide animation for popup window exit transition
            val slideOut = Slide()
            slideOut.slideEdge = Gravity.RIGHT
            popupWindow.exitTransition = slideOut

        }
        val vitoria = popup.findViewById<ImageView>(R.id.vitoria)
        GlideApp.with(popup)
                .load("https://media.tenor.com/images/2c3ab6ec5bb68cfba7a66a1e17d8b1f7/tenor.gif")
                .placeholder(R.mipmap.ic_launcher)
                .into(vitoria)
        TransitionManager.beginDelayedTransition(truco)
        popupWindow.showAtLocation(
                truco,
                Gravity.CENTER,
                0,
                0
        )
        Handler().postDelayed({
            popupWindow.dismiss()
        }, 8000)
    }

}
