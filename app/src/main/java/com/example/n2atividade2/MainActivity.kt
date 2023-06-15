package com.example.n2atividade2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.n2atividade2.Atividades
import com.example.n2atividade2.R

class MainActivity : AppCompatActivity() {

    private val delayMillis: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler(Looper.getMainLooper())

        val runnable = Runnable {

            val intent = Intent(this, Atividades::class.java)
            startActivity(intent)
            finish()
        }

        handler.postDelayed(runnable, delayMillis)
    }
}
