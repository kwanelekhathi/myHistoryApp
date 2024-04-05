package com.example.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress()
class MainActivity : AppCompatActivity() {


    @SuppressLint("SetText118")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entered_age = findViewById<EditText>(R.id.editTextText)
        val history_button = findViewById<Button>(R.id.button)
        val clear_button = findViewById<Button>(R.id.button2)
        val answer = findViewById<TextView>(R.id.textView2)

        history_button.setOnClickListener {
            val age = entered_age.text.toString().toInt()

            if (age < 20) {
                answer.text = "Error, invalid age"
            } else if (entered_age.text.toString().toInt() >= 100) {
                history_button.text = "Error, invalid age"

            } else if (age == 95) {
                answer.text = "Nelson Mandela was the first black president in South Africa"
            } else if (age == 50) {
                answer.text = "Micheal Jackson was an award winning American musician,known as THE KING OF POP"
            } else if (age == 82) {
                answer.text = "Pele was one of the greatest football players to live"
            } else if (age == 41) {
                answer.text = "Virgil was an american creative who owned Off-White"
            } else if (age == 86) {
                answer.text = "Bobby Charlton was a football icon who played for Manchester United"
            } else if (age == 71) {
                answer.text = "Muhammad Ali was one of the greatest boxer in the world"
            }else if (age == 25) {
                answer.text = "Angus Cloud was a famous who stared in Euphoria"
            }
            return@setOnClickListener
            clear_button.setOnClickListener {

                entered_age.setText("")
                answer.setText("")
            }







        }

    }
}

