package com.example.c_kotlink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //1-Suma, 2-Resta, 3-Mul, 4-Div
    var operacion : Int = 0
    var number1 : Double = 0.0
    lateinit var Tx1: TextView
    lateinit var Tx2: TextView
    lateinit var btClean: Button
    lateinit var btEqual: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tx1 = findViewById(R.id.Txt1)
        Tx2 = findViewById(R.id.Txt2)

        btClean = findViewById(R.id.btClean)
        btEqual = findViewById(R.id.btEqual)

        btEqual.setOnClickListener{
            var number2: Double = Tx2.text.toString().toDouble()
            var result : Double = 0.0

            when(operacion){
                1 -> result = number1 + number2
                2 -> result = number1 - number2
                3 -> result = number1 * number2
                4 -> if(number2 != 0.0){result = number1 / number2}else{println("Error Divión por 0")}
            }
            Tx2.setText(result.toString())
            Tx1.setText("")
        }
        btClean.setOnClickListener{
            Tx1.setText("")
            Tx2.setText("")
            number1 = 0.0
            operacion = 0
        }
    }

    fun oprimirDigitoVisual(view: View){

        var Visual2 : String = Tx2.text.toString()

        when(view.id){
            R.id.bt0 -> Tx2.setText(Visual2 + "0")
            R.id.bt1 -> Tx2.setText(Visual2 + "1")
            R.id.bt2 -> Tx2.setText(Visual2 + "2")
            R.id.bt3 -> Tx2.setText(Visual2 + "3")
            R.id.bt4 -> Tx2.setText(Visual2 + "4")
            R.id.bt5 -> Tx2.setText(Visual2 + "5")
            R.id.bt6 -> Tx2.setText(Visual2 + "6")
            R.id.bt7 -> Tx2.setText(Visual2 + "7")
            R.id.bt8 -> Tx2.setText(Visual2 + "8")
            R.id.bt9 -> Tx2.setText(Visual2 + "9")
            R.id.btPoint -> if(!Visual2.contains(".")) {
                Tx2.setText(Visual2 + ".")
            }
        }
    }
    fun operaciones(view: View){
        number1 = Tx2.text.toString().toDouble()
        var number2: String = Tx2.text.toString()
        when(view.id){
            R.id.btSum -> {
                Tx1.setText(number2 + "+")
                operacion = 1
            }
            R.id.btRest -> {
                Tx1.setText(number2 + "-")
                operacion = 2
            }
            R.id.btProduct -> {
                Tx1.setText(number2 + "*")
                operacion = 3
            }
            R.id.btDivition -> {
                Tx1.setText(number2 + "/")
                operacion = 4
            }
        }
        Tx2.setText("")
    }
}