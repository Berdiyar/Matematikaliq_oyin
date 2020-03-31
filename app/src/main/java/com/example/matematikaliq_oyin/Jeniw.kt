package com.example.matematikaliq_oyin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jeniw.*

class Jeniw : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeniw)

        textView.text = "Qutliqlayman siz sorawlardin' ba'rine juwap berdin'iz!!!"
        bas_menyu.setOnClickListener {
            val sms = Intent (this, MainActivity::class.java)
            startActivity(sms)
            finish()
        }

        shigiw.setOnClickListener {
            finish()
        }

    }
}
