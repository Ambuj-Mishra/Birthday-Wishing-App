package com.example.mybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun newed(view: View) {
        val na =Text.editableText.toString()
        val intent = Intent(this,NeWindow::class.java)
        intent.putExtra(NeWindow.n, na)
        startActivity(intent)
    }
}