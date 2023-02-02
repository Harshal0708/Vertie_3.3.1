package com.vertie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.vertie.javacode.activities.ForgotPassword

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<TextView>(R.id.forget_password_button).setOnClickListener {
            startActivity(Intent(this, ForgotPassword::class.java))
        }

        findViewById<Button>(R.id.btlogin).setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }

    }
}