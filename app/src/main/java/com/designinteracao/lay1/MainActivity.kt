package com.designinteracao.lay1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(4000)
                    val intent = Intent(baseContext, HomeActivity::class.java)
                    startActivity(intent)
                } catch (e:Exception) {
                    e.printStackTrace()
                }
            }

        }
        background.start()
    }
}
