package com.example.matematikaliq_oyin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_utiliw.*

class Utiliw : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utiliw)

        menyuga.setOnClickListener {
            val sms = Intent(this, MainActivity::class.java)
            startActivity(sms)
            finish()

        }
    }
}