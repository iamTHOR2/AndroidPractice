package com.example.calculator1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val plus = findViewById<Button>(R.id.btnPlus)
        val minus = findViewById<Button>(R.id.btnMinus)
        val divide = findViewById<Button>(R.id.btnDivide)
        val multipy = findViewById<Button>(R.id.btnMulti)

        val input1 = findViewById<EditText>(R.id.eTInput1)
        val input2 = findViewById<EditText>(R.id.eTInput2)

        val result = findViewById<TextView>(R.id.tVresult)

        plus.setOnClickListener{
            val input1 = input1.text.toString().toInt()
            val input2 = input2.text.toString().toInt()

            result.text = (input1+input2).toString()

        }

        minus.setOnClickListener{
            val input1 = input1.text.toString().toInt()
            val input2 = input2.text.toString().toInt()

            result.text = (input1-input2).toString()

        }

        divide.setOnClickListener{
            val input1 = input1.text.toString().toFloat()
            val input2 = input2.text.toString().toFloat()

            result.text = (input1/input2).toString()

        }

        multipy.setOnClickListener{
            val input1 = input1.text.toString().toInt()
            val input2 = input2.text.toString().toInt()

            result.text = (input1*input2).toString()

        }

        }
    }
