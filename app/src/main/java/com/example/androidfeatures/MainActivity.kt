package com.example.androidfeatures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androidfeatures.linear_layout.LinearLayoutActivity
import com.example.androidfeatures.pages.constraint_layout.ConstraintLayoutActivity
import com.example.androidfeatures.relative_layout.RelativeLayoutActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnLinearOnClick(v : View){
        val intent = Intent(this,LinearLayoutActivity::class.java)
        startActivity(intent)
    }

    fun btnRelativeOnClick(v : View){
        val intent = Intent(this, RelativeLayoutActivity::class.java)
        startActivity(intent)
    }

    fun btnConstraintOnClick(v : View){
        val intent = Intent(this, ConstraintLayoutActivity::class.java)
        startActivity(intent)
    }
}
