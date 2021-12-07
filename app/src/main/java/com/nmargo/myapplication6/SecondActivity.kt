package com.nmargo.myapplication6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.TextView

private const val HELLO_KEY = "hello"

class SecondActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        helloTextView=findViewById(R.id.hello_text_view)
        val helloValue:String? = intent.extras?.getString(HELLO_KEY)
        helloTextView.text = helloValue
    }
}