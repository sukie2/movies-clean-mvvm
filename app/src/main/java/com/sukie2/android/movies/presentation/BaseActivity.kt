package com.sukie2.android.movies.presentation

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


open class BaseActivity : AppCompatActivity() {

    private lateinit var alertDialogVar: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.sukie2.android.movies.R.layout.activity_base)
        alertDialogVar = AlertDialog.Builder(this@BaseActivity).create()
    }

    fun showLoader(){
        alertDialogVar.show()
    }
    fun hideLoader(){
        alertDialogVar.dismiss()
    }
}
