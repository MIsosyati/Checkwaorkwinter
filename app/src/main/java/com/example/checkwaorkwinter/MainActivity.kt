package com.example.checkwaorkwinter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count: Int = 0
        val messege = findViewById<TextView>(R.id.messege)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        messege.setText(count)
        button.setBackgroundColor(Color.parseColor("#47885e"))
        button.setOnClickListener(){count-0.5
            messege.setText(count)


        }
        button2.setOnClickListener(){count+0.5
            messege.setText(count)


        }
        button3.setOnClickListener(){count-1
            messege.setText(count)


        }
        button4.setOnClickListener(){count+1
            messege.setText(count)


        }
        button5.setOnClickListener(){count-10
            messege.setText(count)


        }
        button6.setOnClickListener(){count+10
            messege.setText(count)


        }

     //   if (count=>100){


       // }



    }
}