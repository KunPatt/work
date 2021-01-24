package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toastrm = Toast.makeText(applicationContext, "กรุณากรอกให้ครบทุกช่อง!!", Toast.LENGTH_LONG)
        val toastpw = Toast.makeText(applicationContext, "รหัสไม่ตรงกัน!!", Toast.LENGTH_LONG)
        val toastuse_pw = Toast.makeText(applicationContext, "ยูสเซอร์เนมกับพาสเวิดตรงกัน!!", Toast.LENGTH_LONG)
        val toastok = Toast.makeText(applicationContext, "Ok", Toast.LENGTH_LONG)
        val toastclear = Toast.makeText(applicationContext, "Complete!!", Toast.LENGTH_LONG)

        ok.setOnClickListener() {
            if (name.text.toString() == "") {
                toastrm.show()
            } else if (pw.text.toString() == "") {
                toastrm.show()
            } else if (cpw.text.toString() == "") {
                toastrm.show()
            } else {
                if (name.text.toString() == pw.text.toString()) {
                    toastuse_pw.show()
                } else {
                    if (pw.text.toString() == cpw.text.toString() && name.text.toString() != "") {
                        toastok.show()
                    } else if (pw.text.toString() != cpw.text.toString()) {
                        toastpw.show()

                    }
                }
            }
        }

        clear.setOnClickListener() {
            name.setText("")
            pw.setText("")
            cpw.setText("")
            toastclear.show()
        }
    }
}




