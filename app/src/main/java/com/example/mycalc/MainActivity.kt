package com.example.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* row 1 */

        /* row IDs */
        val btn7 = findViewById<Button>(R.id.btnSevem)
        val btn8 = findViewById<Button>(R.id.btnEight)
        val btn9 = findViewById<Button>(R.id.btnNine)
        val btnDiv = findViewById<Button>(R.id.btnDivide)

        /* click listeners */
        btn7.setOnClickListener{
            Toast.makeText(this, "Btn 7 Clicled", Toast.LENGTH_SHORT).show()
        }

        btn8.setOnClickListener{
            Toast.makeText(this, "Btn 8 Clicled", Toast.LENGTH_SHORT).show()
        }

        btn9.setOnClickListener{
            Toast.makeText(this, "Btn 9 Clicled", Toast.LENGTH_SHORT).show()
        }

        btnDiv.setOnClickListener{
            Toast.makeText(this, "Btn div Clicled", Toast.LENGTH_SHORT).show()
        }

    }
}