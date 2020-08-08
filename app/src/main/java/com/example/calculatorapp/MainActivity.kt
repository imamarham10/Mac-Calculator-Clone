package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buNumberEvent(view : View)
    {
        if(isOpTrue)
        {
            editNumber.setText("")
        }
        isOpTrue = false
        val buSelect = view as Button
        var buClickValue = editNumber.text.toString()
        when(buSelect.id)
        {
            bu0.id->{
                buClickValue += "0"
            }
            bu1.id->{
                buClickValue += "1"
            }
            bu2.id->{
                buClickValue += "2"
            }
            bu3.id->{
                buClickValue += "3"
            }
            bu4.id->{
                buClickValue += "4"
            }
            bu5.id->{
                buClickValue += "5"
            }
            bu6.id->{
                buClickValue += "6"
            }
            bu7.id->{
                buClickValue += "7"
            }
            bu8.id->{
                buClickValue += "8"
            }
            bu9.id->{
                buClickValue += "9"
            }
            buDot.id-> {
                buClickValue += "."
            }
            buPM.id->{
                buClickValue = "-" + buClickValue
            }
        }

        editNumber.setText(buClickValue)

    }
var isOpTrue = true
var oldNumber=""
var op = ""

    fun buOpeEvent(view:View)
    {
        val buSelect = view as Button
        val buClickValue:String = editNumber.text.toString()
        when(buSelect.id)
        {
            buMul.id->{
                op = "*"

            }
            buMin.id->{
                op = "-"
            }
            buDiv.id->
            {
                op = "/"
            }
            buSum.id->{
                op = "+"
            }
        }
        oldNumber = editNumber.text.toString()
        isOpTrue = true
    }
    var newNumber = ""
    fun buEqEvent(view: View)
    {
        newNumber = editNumber.text.toString()
        var finalNumber:Double? = null
        when(op)
        {
            "*"->
            {
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "+"->
            {
                finalNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
            "-"->
            {
                finalNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
            "/"-> {
                finalNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
        }
        editNumber.setText(finalNumber.toString())
        isOpTrue = true

    }
    fun buPercent(view: View)
    {
        var number:Double = editNumber.text.toString().toDouble()/100
        editNumber.setText(number.toString())
        isOpTrue = true
    }
    fun buAC(view: View)
    {
        editNumber.setText("0")
        isOpTrue = true
    }
}