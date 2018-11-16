package com.atividade3mobile.kotlin_atividade3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", this.localClassName + ".onCreate() chamado.")
    }


    fun changeActivity2(view: View) {
        val intent = Intent(applicationContext,Screen2::class.java)

        intent.putExtra("input",editText.text.toString())

        startActivity(intent)
    }

    fun changeActivity3(view: View) {
        val intent2 = Intent(applicationContext,Screen3::class.java)

        //intent2.putExtra("input",editText.text.toString())

        startActivity(intent2)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.d("TAG", this.localClassName + ".onSaveInstanceState() chamado.")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", this.localClassName + ".onStart() chamado.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", this.localClassName + ".onResume() chamado.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", this.localClassName + ".onStop() chamado.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", this.localClassName + ".onDestroy() chamado.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", this.localClassName + ".onRestart() chamado.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", this.localClassName + ".onPause() chamado.")
    }
}
