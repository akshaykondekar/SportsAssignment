package com.app.sportsassignment.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.app.sportsassignment.R
import com.app.sportsassignment.databinding.FragmentHomeBinding
import com.app.sportsassignment.util.Resource
import com.app.sportsassignment.viewmodel.SportsViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: SportsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_home, null, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        setupObserver()

        with(binding){
            mbtnStats.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_teamsDetailsFragment)
            }
        }
    }

    private fun setupObserver() {
        viewModel.firstScreenData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    /*hideProgressBar()
                    response.data?.let { newsResponse ->
                        newsAdapter.differ.submitList(newsResponse.articles)
                    }*/
                }
                is Resource.Error -> {
                    /*hideProgressBar()
                    response.message?.let { message ->
                        Log.e(TAG, "An error occured: $message")
                    }*/
                }
                is Resource.Loading -> {
                    //showProgressBar()
                }
            }
        }
    }
}