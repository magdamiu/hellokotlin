package com.magdamiu.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val meesageEditText = findViewById<TextView>(R.id.et_message)
        val showButton = findViewById<Button>(R.id.btn_show)

        showButton.setOnClickListener{ toast("${meesageEditText.text}")}


    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}
