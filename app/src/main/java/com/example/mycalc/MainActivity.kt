package com.example.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input=findViewById<TextView>(R.id.input)
        val output=findViewById<TextView>(R.id.output)

        //var myArrayList:String=""
        var operator=true
        var myString:String=""
        var dot=false

        /* row 1 */

        /* row IDs */
        val btn7 = findViewById<Button>(R.id.btnSevem)
        val btn8 = findViewById<Button>(R.id.btnEight)
        val btn9 = findViewById<Button>(R.id.btnNine)
        val btnDiv = findViewById<Button>(R.id.btnDivide)

        /* click listeners */
        btn7.setOnClickListener{
            myString += "7"
            operator=false
            input.text=myString

        }

        btn8.setOnClickListener{
            myString += "8"
            operator=false
            input.text=myString
        }

        btn9.setOnClickListener{
            myString += "9"
            operator=false
            input.text=myString
        }

        btnDiv.setOnClickListener{
            if(!operator){
                myString +="/"
                input.text=myString
                operator=true
                dot=false
            } else {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        /* row 2 */

        /* row IDs */
        val btn4 = findViewById<Button>(R.id.btnFour)
        val btn5 = findViewById<Button>(R.id.btnFive)
        val btn6 = findViewById<Button>(R.id.btnSix)
        val btnMul = findViewById<Button>(R.id.btnMultiply)

        /* click listeners */
        btn4.setOnClickListener{
            myString += "4"
            operator=false
            input.text=myString
        }

        btn5.setOnClickListener{
            myString += "5"
            operator=false
            input.text=myString
        }

        btn6.setOnClickListener{
            myString += "6"
            operator=false
            input.text=myString
        }

        btnMul.setOnClickListener{
            if(!operator){
                myString +="*"
                input.text=myString
                operator=true
                dot=false
            } else {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        /* row 3 */

        /* row IDs */
        val btn1 = findViewById<Button>(R.id.btnOne)
        val btn2 = findViewById<Button>(R.id.btnTwo)
        val btn3 = findViewById<Button>(R.id.btnThree)
        val btnMinus = findViewById<Button>(R.id.btnSubtract)

        /* click listeners */
        btn1.setOnClickListener{
            myString += "1"
            operator=false
            input.text=myString
        }

        btn2.setOnClickListener{
            myString += "2"
            operator=false
            input.text=myString
        }

        btn3.setOnClickListener{
            myString += "3"
            operator=false
            input.text=myString
        }

        btnMinus.setOnClickListener{
            if(!operator){
                myString +="-"
                input.text=myString
                operator=true
                dot=false
            } else {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        /* row 4 */

        /* row IDs */
        val btn0 = findViewById<Button>(R.id.btnZero)
        val btnDot = findViewById<Button>(R.id.btnDot)
        val btnMod = findViewById<Button>(R.id.btnModulus)
        val btnAdd = findViewById<Button>(R.id.btnAddition)

        /* click listeners */
        btn0.setOnClickListener{
            myString += "0"
            operator=false
            input.text=myString
        }

        btnDot.setOnClickListener{
            if(!dot){
                myString+="."
                dot=true
                input.text=myString
            } else {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        btnMod.setOnClickListener{
            if(!operator){
                myString +="%"
                input.text=myString
                operator=true
                dot=false
            } else {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        btnAdd.setOnClickListener{
            if(!operator){
                myString +="+"
                input.text=myString
                operator=true
                dot=false
            } else {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

        /* row 5 */

        /* row IDs */
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnEqual = findViewById<Button>(R.id.btnEqual)

        /* click listeners */
        btnClear.setOnClickListener{
            myString=""
            input.text=myString
            output.text=myString
            operator=false
            dot=false
        }

        btnBack.setOnClickListener{
            myString=myString.dropLast(1 )
            input.text=myString
        }

        btnEqual.setOnClickListener{
            if(!operator){
                val exp=ExpressionBuilder(myString).build()
                val res=exp.evaluate()
                output.text=res.toString()
                myString=res.toString()
                input.text=myString
            } else {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
