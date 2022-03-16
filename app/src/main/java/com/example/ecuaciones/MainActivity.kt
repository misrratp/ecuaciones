package com.example.ecuaciones

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a: Double
        var b: Double
        var c: Double
        var x1: Double
        var x2: Double


        var txta = findViewById<EditText>(R.id.txta)
        var txtb = findViewById<EditText>(R.id.txtb)
        var txtc = findViewById<EditText>(R.id.txtc)
        var btnecu = findViewById<Button>(R.id.bResol)


        var txtec = findViewById<EditText>(R.id.txtEcuacion)

        var txtresol = findViewById<TextView>(R.id.txtResol)
        btnecu.setOnClickListener {
            a = txta.text.toString().toDouble()
            b = txtb.text.toString().toDouble()
            c = txtc.text.toString().toDouble()
            var resul1 = ((b * b) - 4 * (a * c))
            if (resul1 < 0) {
                Toast.makeText(this, "No se puede porque es 0", Toast.LENGTH_SHORT).show()
            } else if (resul1 === 0.0) {
                x1 = (-b) / (2 * a)
                x2 = x1
            } else if (resul1 > 0.0) {
                x1 = (-b + Math.sqrt(resul1)) / (2 * a)
                x2 = (-b - Math.sqrt(resul1)) / (2 * a)
                var rounded=String.format("%.2f",x1)
                var rounded1=String.format("%.2f",x2)

                txtresol.setText("x1=$rounded \n x2=$rounded1")


            }

        }
    }
}