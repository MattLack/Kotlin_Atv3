package com.atividade3mobile.kotlin_atividade3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        Log.d("TAG", this.localClassName + ".onCreate() chamado.")
    }

    fun goBack1(view: View){

        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)

    }

    fun goBack2(view: View){
        val intent = Intent(applicationContext,Screen2::class.java)
        intent.putExtra("input","to voltando pra 2")
        startActivity(intent)
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
