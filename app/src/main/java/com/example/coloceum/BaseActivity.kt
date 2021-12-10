package com.example.coloceum

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    val mContenxt = this

    abstract fun setupEvents()
    abstract fun setValues()
}