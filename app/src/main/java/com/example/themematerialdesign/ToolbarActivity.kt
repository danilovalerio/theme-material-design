package com.example.themematerialdesign

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class ToolbarActivity : AppCompatActivity() {

    private var context : Context? = null
//    private lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        initVars()

    }

    private fun initVars(){
        context = this

    }
}
