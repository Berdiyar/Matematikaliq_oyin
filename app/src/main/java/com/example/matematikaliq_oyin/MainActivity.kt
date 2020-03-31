package com.example.matematikaliq_oyin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            Toast.makeText(this,"Oynnin' tiykarg'i sharti brilgen sorawg'a duris juwap tabiw kerek boladi.",
                Toast.LENGTH_LONG).show()

        }

        button1.setOnClickListener {
            val sms = Intent (this, Oyin_funksiyasi::class.java)
            startActivity(sms)
            finish()
        }

        button3.setOnClickListener {
            finish()
        }
    }
}
