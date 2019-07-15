package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.kotlintest.mode.Runoob
import kotlin.math.log

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        Toast.makeText(this, "被点击了", Toast.LENGTH_SHORT).show()
    }

    var btnName = "这是一个名字"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv = findViewById<TextView>(R.id.tv)
        var click = findViewById<AppCompatButton>(R.id.btn_click)

        click.text = this.btnName


        tv.setOnClickListener(this)
        Log.d("Mainactivity", tv.hasOnClickListeners().toString())
        click.setOnClickListener {
            tv.text = stringTemplate(tv.text.toString())
        }

        when (10) {
            in 1..10 -> Log.d("main", "x is in the range")
            !in 10..20 -> Log.d("main", "x is outside the range")
            else -> Log.d("main", "none of the above")
        }

//        LOG.d("main", isString("nihao").toString())
//        var person = Person("houjiguo");
        var runoob = Runoob("浦东新区")
        runoob.printTest()

        LOG(runoob.siteName)
        LOG(runoob.country)



        LOG("不可变集合")
        var nullList = listOf<Int>()
        var list2: List<Int> = listOf(5, 2, 3)
        LOG(list2.toString())
        var canchan = nullList.toMutableList()
        canchan.add(1)
        LOG(canchan.toString())


        /*创建空的可变集合*/
        var nullchangeList = mutableListOf<String>("12213")
        var canChangeList = mutableListOf("baidu", "google", "sougou")

        /*集合中增加集合*/
        var newList = nullchangeList.plus(canChangeList)
        LOG("nullchangeList的长度" + newList.size)


        LOG("可变集合源$canChangeList")
        canChangeList.add("tecent")
        LOG("可变集合源增加数据$canChangeList")
        canChangeList.add(4, "JD")
        LOG("可变集合源增加JD$canChangeList")

        LOG("循环控制")

        /*输出集合的数据*/
        for (st in canChangeList) {
            LOG(st)
        }

        /*输出集合中的数据，根据index*/
        for (st in canChangeList.indices) {
            LOG("第$st 数据是" + canChangeList.get(st))
        }


        var mindex = canChangeList.iterator()
        while (mindex.hasNext()) {
            LOG("hasnext的数据----》" + mindex.next())
        }


        for (i in canChangeList.size downTo 0) {
            LOG("逆向循环$i")
        }

        for ((index, value) in canChangeList.withIndex()) {
            LOG("下标$index\t处的值为$value")
        }


        canChangeList.forEach {
            LOG("使用foreach循环得到value值为 $it")
        }

    }

    fun goNext(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("action", "search")
        startActivity(intent)
    }


    /*用模板¬*/
    private fun stringTemplate(string: String): String {
        return "$string,被点击了"
    }

    fun isString(parm: Any) {
        when (parm) {
            is String -> true
            else -> false
        }
    }


}

