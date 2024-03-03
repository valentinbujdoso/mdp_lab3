package com.example.problem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import androidx.core.text.bold
import androidx.core.text.color
import com.example.problem2.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.headerText.text = SpannableStringBuilder()
            .append("Sign in to ")
            .bold { append("Zappos.com") }
            .append(" using your amazon account")

        binding.keepMeSignedChck.text = SpannableStringBuilder()
            .append("Keep me signed in. ")
            .color(getResources().getColor(R.color.blue)) {append("Details")}
    }


}