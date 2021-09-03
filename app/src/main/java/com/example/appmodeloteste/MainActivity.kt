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
        Log.i("AppSplash", "Log de information")
        Log.w("AppSplash","Log de warning")
        Log.e("AppSplash","Log de erro")
        Log.d("AppSplash","Log de debug")
        Log.v("AppSplash": "Log de verbose")


        Toast.makeText(this, "Sair do app!", Toast.LENGTH_SHORT).show()
        finish()
    }
}