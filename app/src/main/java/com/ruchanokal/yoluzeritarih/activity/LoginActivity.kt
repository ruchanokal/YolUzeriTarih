package com.ruchanokal.yoluzeritarih.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruchanokal.yoluzeritarih.R
import com.ruchanokal.yoluzeritarih.databinding.ActivityLoginBinding
import com.ruchanokal.yoluzeritarih.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.normalGirisYap.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        binding.googleGirisYap.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)


        }


        binding.facebookGirisYap.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)


        }

        binding.kayitOl.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


    }
}