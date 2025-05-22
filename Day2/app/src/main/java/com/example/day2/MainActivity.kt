package com.example.day2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etFullName: EditText
    private lateinit var etAge: EditText
    private lateinit var btnCheck: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFullName = findViewById(R.id.etFullName)
        etAge = findViewById(R.id.etAge)
        btnCheck = findViewById(R.id.btnCheck)
        tvResult = findViewById(R.id.tvResult)

        btnCheck.setOnClickListener {
            checkAgeAndDisplayResult()
        }
    }

    private fun checkAgeAndDisplayResult() {
        val fullName = etFullName.text.toString().trim()
        val ageString = etAge.text.toString().trim()

        if (fullName.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập Họ và tên", Toast.LENGTH_SHORT).show()
            return
        }

        if (ageString.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập Tuổi", Toast.LENGTH_SHORT).show()
            return
        }

        val age = ageString.toIntOrNull()

        if (age == null) {
            Toast.makeText(this, "Tuổi không hợp lệ. Vui lòng nhập một số.", Toast.LENGTH_SHORT).show()
            return
        }

        val ageGroup: String
        when {
            age > 65 -> ageGroup = "Người già"
            age >= 6 && age <= 65 -> ageGroup = "Người lớn"
            age >= 2 && age <= 5 -> ageGroup = "Trẻ em"
            age < 2 -> ageGroup = "Em bé"
            else -> ageGroup = "Không xác định"
        }

        val resultText = "Họ và tên: $fullName\nTuổi: $age\nNhóm: $ageGroup"
        tvResult.text = resultText
    }
}