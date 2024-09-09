package com.example.viewmodel_practice_project

import MyViewModel
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.example.viewmodel_practice_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.test.observe(this, Observer { test ->
            binding.textView.text = test
        })
        binding.sendBtn.setOnClickListener {
            val testMessage = "Hello My test Message"
            viewModel.updateTest(testMessage)
        }
    }
}
