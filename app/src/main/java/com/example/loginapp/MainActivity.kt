package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            var status=if(username_et.text.toString().equals("Admin") &&
                    password_et.text.toString().equals("Jelszo")) "Sikeres" else "Sikertelen"
            Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
        }
    }
}
