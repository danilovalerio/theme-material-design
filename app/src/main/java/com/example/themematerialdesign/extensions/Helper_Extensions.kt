package com.example.themematerialdesign.extensions

import android.app.Activity
import android.widget.Toast

fun Activity.toast(msg: CharSequence, length: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
