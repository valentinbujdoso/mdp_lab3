package com.example.problem1

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import com.example.problem1.R.id.table
import com.example.problem1.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val badd = findViewById<Button>(R.id.add_button)

        val tl = findViewById<TableLayout>(table)
        val header = TableRow(this)
        val wrs_header = TextView(this)
        val location_header = TextView(this)
        val type_header = TextView(this)

        wrs_header.text="Water Resource Name"
        location_header.text="Location"
        type_header.text="Type"

        header.addView(wrs_header)
        header.addView(location_header)
        header.addView(type_header)
        tl.addView(header)

        // Retrieve the views from XML to Kotlin code using findViewBtId method
        val badd = findViewById<Button>(R.id.add_button)
        // Anonymous Implementation of Button click event listener to give a toast Message
        badd.setOnClickListener {
            val wrn = binding.waterResourceName.text.toString()
            val location = binding.location.text.toString()
            val type = binding.type.text.toString()

            if (wrn == "") {
                Toast.makeText(this, "Water resource name cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            else if (location == "") {
                Toast.makeText(this, "Location cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            else if (type == "") {
                Toast.makeText(this, "Type cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val row = TableRow(this)
            val wrn_view = TextView(this)
            val location_view = TextView(this)
            val type_view = TextView(this)

            wrn_view.text = wrn
            location_view.text = location
            type_view.text = type

            row.addView(wrn_view)
            row.addView(location_view)
            row.addView(type_view)
            tl.addView(row)
        }
    }
}