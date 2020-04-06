package com.example.matematikaliq_oyin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_oyin_funksiyasi.*
import java.util.*

class Oyin_funksiyasi : AppCompatActivity() {

    private val random = Random()
    private var durisjuwap2: Float = 0F
    private var aylanis: Int = 0
    private val max_soraw_sani = 15
    private var a: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyin_funksiyasi)

        a = intent.getIntExtra("a", 0)

        generatsiylaw()

    }

    fun basilganda(view: View){
        val basil = (view as Button).text.toString().toFloat()
        if(aylanis==max_soraw_sani){
            val sms = Intent (this, Jeniw::class.java)
            startActivity(sms)
            finish()
        }
        else if(basil==durisjuwap2){
            generatsiylaw()
            aylanis+=1

        }
        else{
            val sms = Intent (this, Utiliw::class.java)
            startActivity(sms)
            finish()
        }


    }

    fun generatsiylaw(){

        var bir: Int = 0
        var b: String
        var s: Int = 0
        var san: Int = 0

        s = ixtiyariy_san(bir)
        durisjuwap2 += s.toFloat()
        b = "$s"

        while(san < a){

        val belgi = Random().nextInt(4)
            s = ixtiyariy_san(bir)
        when(belgi){
            0->b = "$b + $s"
            1->b = "$b - $s"
            2->b = "$b * $s"
            else->b = "$b / $s"
        }
        when(belgi){
            0->{
                durisjuwap2 += s.toFloat()
            }
            1->{
                durisjuwap2 -= s.toFloat()
            }
            2->{
                durisjuwap2 *= s.toFloat()
            }
            else->{
                durisjuwap2 /= s.toFloat()
            }
        }
            san+=1
        }
        soraw.text = b
        qate_juwap_generatsiyasi(juwap_1)
        qate_juwap_generatsiyasi(juwap_2)
        qate_juwap_generatsiyasi(juwap_3)
        qate_juwap_generatsiyasi(juwap_4)

        when(random.nextInt(4)){
            0->{
                juwap_1.text = durisjuwap2.toString()
            }
            1->{
                juwap_2.text = durisjuwap2.toString()
            }
            2-> {
                juwap_3.text = durisjuwap2.toString()

            }
            else->{
                juwap_4.text = durisjuwap2.toString()
            }
        }



    }

    private fun ixtiyariy_san(san: Int): Int {
        var s = Random().nextInt(100)
        return s
    }

    private fun qate_juwap_generatsiyasi(button: Button){
        when(random.nextBoolean()){
            true->{
                button.text = (durisjuwap2 + random.nextInt(100).toFloat()+1).toString()
            }
            false->{
                button.text = (durisjuwap2 - random.nextInt(100).toFloat()+1).toString()
            }
        }
    }

}
