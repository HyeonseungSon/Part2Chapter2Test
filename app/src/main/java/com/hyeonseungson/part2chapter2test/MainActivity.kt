package com.hyeonseungson.part2chapter2test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        sumButton.setOnClickListener {



            var int1 : Int = integer1.text.toString().toInt()
            var int2 : Int = integer2.text.toString().toInt()
            var int3 : Int = integer3.text.toString().toInt()
            var int4 : Int = integer4.text.toString().toInt()
            var int5 : Int = integer5.text.toString().toInt()

            // Log Test
            Log.d("int1~5 test", "$int1, $int2, $int3, $int4, $int5")

            val string1 : String = int1.toString()
            val string2 : String = int2.toString()
            val string3 : String = int3.toString()
            val string4 : String = int4.toString()
            val string5 : String = int5.toString()

            Log.d("string1~5 test", string1+", "+string2+", "+string3+", "+string4+", "+string5)

            int1 = string1.toInt()
            int2 = string2.toInt()
            int3 = string3.toInt()
            int4 = string4.toInt()
            int5 = string5.toInt()

            val sum = int1+int2+int3+int4+int5

            Log.d("sum test", sum.toString())

            resultText.setText("결과 : $sum")
        }
    }
}