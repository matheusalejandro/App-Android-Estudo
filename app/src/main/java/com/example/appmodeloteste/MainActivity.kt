package com.example.appmodeloteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun acaoSair(view: View) {
        //TODO: criar todo
        //FIXME: ação de fix
        val tag: String = "AppSplash"

        Log.i(tag, "Log de information")
        Log.w(tag,"Log de warning")
        Log.e(tag,"Log de erro")
        Log.d(tag,"Log de debug")
        Log.v(tag, "Log de verbose")


        Toast.makeText(this, "Sair do app!", Toast.LENGTH_SHORT).show()
        finish()
    }
}