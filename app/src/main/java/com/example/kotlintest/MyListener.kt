package com.example.kotlintest

import android.view.View

interface MyListener {

    fun click(msg: String)
    fun confirm()



    fun onClick(o: Any, view: View)


}
