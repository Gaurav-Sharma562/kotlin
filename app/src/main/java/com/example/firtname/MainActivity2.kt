package com.example.firtname

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firtname.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_main2)
       val dataReceived= intent
        val fname=dataReceived.getStringExtra(name:"fname")
        val lname=dataReceived.getStringExtra(name:"lname")
        binding.tvName.text="hello $fname, $lname"
    }
}