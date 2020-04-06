package com.example.matematikaliq_oyin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dareje.*

class Dareje : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dareje)

        dareje1.setOnClickListener {
            var intent = Intent (this, Oyin_funksiyasi::class.java)
            intent.putExtra("a", 1)
            startActivity(intent)
            finish()
        }
        dareje2.setOnClickListener {
            var intent = Intent (this, Oyin_funksiyasi::class.java)
            intent.putExtra("a", 2)
            startActivity(intent)
            finish()
        }
        dareje3.setOnClickListener {
            var intent = Intent (this, Oyin_funksiyasi::class.java)
            intent.putExtra("a", 3)
            startActivity(intent)
            finish()
        }
        dareje4.setOnClickListener {
            var intent = Intent (this, Oyin_funksiyasi::class.java)
            intent.putExtra("a", 4)
            startActivity(intent)
            finish()
        }

    }
}
