package com.example.firtname

//import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firtname.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{
             val intent:Intent=Intent(this@MainActivity,MainActivity2::class.java)
            intent.putExtra(name:"fname",bnding.etfname.text.toString())
            intent.putExtra(name:"lname",binding.etlname.text.toString())

            startActivity(intent)
        }
    }


}


