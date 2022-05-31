package com.kjy.databindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kjy.databindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.user = User("JaeYoun", "Kim")






    }
}