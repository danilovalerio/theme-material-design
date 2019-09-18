package com.example.themematerialdesign

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.themematerialdesign.extensions.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initVars()

        btn_login.setOnClickListener(){
            validateForm()
        }

        et_senha.setOnKeyListener(){ view: View, i: Int, keyEvent: KeyEvent ->
//            toast("tecla pressionada")
            if (isEmailValid(et_email.text.toString())){
                textLayout_email.error = null
            } else {
                textLayout_email.error = getString(R.string.error_email)
            }
            false
        }
    }

    private fun initVars(){
        context = this
    }

    fun validateForm(){
        if(isEmailValid(et_email.text.toString())){
            toast("E-mail aceito")
        } else {
            toast("E-mail inválido")
        }

        //valida se o valor está vazio
        if(et_email.text.toString().isEmpty()){
            textLayout_email.error = getString(R.string.error_field_empty)
        } else {
            textLayout_email.error = null
        }

        //valida se o valor da senha está ok
        if(et_senha.text.toString().isEmpty()){
            textLayout_senha.error = getString(R.string.error_field_empty)
        } else {
            textLayout_senha.error = null
        }
    }

    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
