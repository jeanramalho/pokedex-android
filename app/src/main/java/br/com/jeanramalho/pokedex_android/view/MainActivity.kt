package br.com.jeanramalho.pokedex_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.jeanramalho.pokedex_android.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}