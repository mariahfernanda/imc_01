package com.example.calculoimc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcularImc = findViewById<Button>(R.id.calcularImc)

        calcularImc.setOnClickListener(){

            val nome = findViewById<EditText>(R.id.nome).text.toString()
            val peso = findViewById<EditText>(R.id.peso).text.toString().toInt()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val resultado = findViewById<TextView>(R.id.resultado)
            val imc = peso/(altura * altura)
            val imcValor= String.format("%.2f", imc)

                if (imc <18.5){
                    resultado.text = "$nome seu IMC é " + "$imcValor " + "você está abaixo do peso"
                    resultado.setTextColor(Color.RED)
                }else if (imc < 25){
                    resultado.text = "$nome seu IMC é " + "$imcValor " + "você está com o peso ideal"
                    resultado.setTextColor(Color.GREEN)
                }else if (imc < 30){
                    resultado.text = "$nome seu IMC é " + "$imcValor " + "você está levemente acima do peso"
                    resultado.setTextColor(Color.RED)
                }else if (imc < 35){
                    resultado.text = "$nome seu IMC é " + "$imcValor " + "você está com obesidade grau I"
                    resultado.setTextColor(Color.RED)
                }else if (imc < 40){
                    resultado.text = "$nome seu IMC é " + "$imcValor " + "você está com obesidade grau II"
                    resultado.setTextColor(Color.RED)
                }else{
                    resultado.text = "$nome seu IMC é " + "$imcValor " + "você está com obesidade grau III"
                    resultado.setTextColor(Color.RED)
                }






        }

    }
}