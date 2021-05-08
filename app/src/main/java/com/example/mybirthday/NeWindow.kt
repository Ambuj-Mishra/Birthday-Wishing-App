 package com.example.mybirthday
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import kotlinx.android.synthetic.main.activity_ne_window.*

class NeWindow : AppCompatActivity() {
    companion object {
        const val n=""
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ne_window)
        val m = intent.getStringExtra(n)
        textView3.text = "Happy Birthday \n $m"
    }
}