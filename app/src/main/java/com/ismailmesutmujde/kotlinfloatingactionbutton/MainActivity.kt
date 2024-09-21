package com.ismailmesutmujde.kotlinfloatingactionbutton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinfloatingactionbutton.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.fab.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()
        }
    }
}