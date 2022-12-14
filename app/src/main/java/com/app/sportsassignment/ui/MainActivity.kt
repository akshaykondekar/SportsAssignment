package com.app.sportsassignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.app.sportsassignment.R
import com.app.sportsassignment.databinding.ActivityMainBinding
import com.app.sportsassignment.repository.SportsRepository
import com.app.sportsassignment.viewmodel.SportsViewModel
import com.app.sportsassignment.viewmodel.SportsViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: SportsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        setContentView(binding.root)

        val newsRepository = SportsRepository()
        val viewModelProviderFactory = SportsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[SportsViewModel::class.java]
    }
}