package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hmarques98.SimpleCalculator
import com.hmarques98.StartActivity


class MainActivity : AppCompatActivity() {

    val add = SimpleCalculator().add(4, 3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.myText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, StartActivity::class.java)

            val criteriaList = arrayListOf<Number>()
            val searchCriteria = 10
            criteriaList.add(searchCriteria)

            intent.putExtra("searchCriteria", criteriaList)
            startActivity(intent)
        }

        text.text = "$add"

    }


}