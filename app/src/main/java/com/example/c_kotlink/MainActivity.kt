package com.example.c_kotlink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // 1-Suma, 2-Resta, 3-Mul, 4-Div
    var operacion: Int = 0
    var number1: Double = 0.0
    var number2: Double = 0.0
    lateinit var Tx1: TextView
    lateinit var Tx2: TextView
    lateinit var btClean: Button
    lateinit var btEqual: Button
    var points: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tx1 = findViewById(R.id.Txt1)
        Tx2 = findViewById(R.id.Txt2)

        btClean = findViewById(R.id.btClean)
        btEqual = findViewById(R.id.btEqual)

        btEqual.setOnClickListener {
            aritmeticas()
        }

        btClean.setOnClickListener {
            limpiar()
        }
    }

    fun aritmeticas() {
        val textoTx2 = Tx2.text.toString()
        if (textoTx2.isEmpty()) {
            number2 = 0.0
        } else {
            number2 = textoTx2.toDoubleOrNull() ?: 0.0
        }
        var result: Double = 0.0

        when (operacion) {
            1 -> result = number1 + number2
            2 -> result = number1 - number2
            3 -> result = number1 * number2
            4 -> if (number2 != 0.0) {
                result = number1 / number2
            } else {
                println("Error División por 0")
            }
        }
        Tx2.text = result.toString()
        Tx1.text = ""
    }

    private fun limpiar() {
        Tx1.text = ""
        Tx2.text = ""
        number1 = 0.0
        operacion = 0
    }

    fun oprimirDigitoVisual(view: View) {
        val push = (view as Button).text.toString()
        val Visual2 = Tx2.text.toString()

        if (push == ".") {
            if (!points) {
                Tx2.text = Visual2 + push
                points = true
            }
        } else {
            Tx2.text = Visual2 + push
        }
    }

    fun operaciones(view: View) {
        number1 = Tx2.text.toString().toDouble()
        var number2 = Tx2.text.toString().toDouble()
        when (view.id) {
            R.id.btSum -> {
                Tx1.text = "$number2 +"
                operacion = 1
            }
            R.id.btRest -> {
                Tx1.text = "$number2 -"
                operacion = 2
            }
            R.id.btProduct -> {
                Tx1.text = "$number2 *"
                operacion = 3
            }
            R.id.btDivition -> {
                Tx1.text = "$number2 /"
                operacion = 4
            }
        }
        Tx2.text = ""
    }
    fun sumar(): Double {
        return number1 + number2
    }

    fun restar(): Double {
        return number1 - number2
    }

    fun multiplicar(): Double {
        return number1 * number2
    }

    fun dividir(): Double {
        return number1 / number2
    }
}
