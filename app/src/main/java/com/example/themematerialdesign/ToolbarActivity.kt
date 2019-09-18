package com.example.themematerialdesign

import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.themematerialdesign.extensions.toast


class ToolbarActivity : AppCompatActivity() {

    private var context : Context? = null
    private lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        setSupportActionBar(findViewById(R.id.myToolbar))

        initVars()

    }

    //adiciona o menu personalizado a toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    //verifica qual item do menu foi clicado
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.buscar_menu -> toast("Buscar selecionado")
            R.id.carrinho_menu -> toast("Carrinho selecionado")
            R.id.config_menu -> toast("Configurações selecionado")
            R.id.sobre_menu -> toast("Sobre selecionado")

        }


        return super.onOptionsItemSelected(item)
    }

    private fun initVars(){
        context = this

    }
}
