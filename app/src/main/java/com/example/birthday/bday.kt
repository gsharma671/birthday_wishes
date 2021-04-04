package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bday.*

class bday : AppCompatActivity() {
    companion object{
        const val extra_name="extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday)
        val name=intent.getStringExtra(extra_name)
        textView2.text="$name"
    }

}
