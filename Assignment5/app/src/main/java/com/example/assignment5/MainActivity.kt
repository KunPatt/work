package com.example.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toastmn = Toast.makeText(applicationContext, "ไม่สามารถลดค่าได้แล้ว!!", Toast.LENGTH_LONG)
        val toastadd = Toast.makeText(applicationContext,"ไม่สามารถเพิ่มค่าได้แล้ว!!", Toast.LENGTH_LONG)
        var number = 0

        add.setOnClickListener {
            if ( number >= 0 && number <= 8 ) {
                number++
                nb.setText("$number")
            } else if (number >= 8 ) {
                toastadd.show()
            }
        }
        minus.setOnClickListener {
            if ( number <= 9 && number >= 1 ) {
                number--
                nb.setText("$number")
            } else if (number == 0 ) {
                toastadd.show()
            }
        }
        reset.setOnClickListener {
            nb.setText("0")
    }
}
    }