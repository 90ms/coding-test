package com.example.coding_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coding_test.level_1.CreateId

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CreateId.solution("1111!@#$%^&*()_+-111")
    }
}