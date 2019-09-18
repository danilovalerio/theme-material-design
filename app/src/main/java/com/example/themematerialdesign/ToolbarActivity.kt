package com.example.themematerialdesign

import android.content.Context
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class ToolbarActivity : AppCompatActivity() {

    private var context : Context? = null
    private lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        setSupportActionBar(findViewById(R.id.myToolbar))

        initVars()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    private fun initVars(){
        context = this

    }
}
