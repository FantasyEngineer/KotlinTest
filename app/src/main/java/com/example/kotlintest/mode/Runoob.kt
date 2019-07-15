package com.example.kotlintest.mode

import com.example.kotlintest.LOG

class Runoob constructor(name: String) {
    var url: String = "www.baidu.com"
    var country: String = "CN"
    var siteName = name

    init {
        LOG("初始化名称：$name")
    }

    fun printTest() {
        LOG("我是类的函数")

    }

}