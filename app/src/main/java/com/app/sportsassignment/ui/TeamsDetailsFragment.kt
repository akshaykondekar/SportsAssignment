package com.app.sportsassignment.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.app.sportsassignment.adapter.FirstTeamAdapter
import com.app.sportsassignment.R
import com.app.sportsassignment.adapter.SecondTeamAdapter
import com.app.sportsassignment.databinding.FragmentTeamsDetailsBinding
import com.app.sportsassignment.model.CustomPlayer
import com.app.sportsassignment.model.firstTeam
import com.app.sportsassignment.model.secondTeam
import com.app.sportsassignment.util.Resource
import com.app.sportsassignment.viewmodel.SportsViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class TeamsDetailsFragment : Fragment() {

    private lateinit var binding: FragmentTeamsDetailsBinding
    private lateinit var viewModel: SportsViewModel
    private lateinit var firstTeamAdapter: FirstTeamAdapter
    private lateinit var secondTeamAdapter: SecondTeamAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_teams_details, null, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        setupObserver()

        firstTeamAdapter = FirstTeamAdapter(requireContext())
        firstTeamAdapter.updateList(firstTeam)

        secondTeamAdapter = SecondTeamAdapter(requireContext())
        secondTeamAdapter.updateList(secondTeam)

        firstTeamAdapter.itemActionClick { player ->
            showPlayerDetails(player)
        }

        secondTeamAdapter.itemActionClick { player ->
            showPlayerDetails(player)
        }

        with(binding){
            rvFirstTeamList.adapter = firstTeamAdapter
            rvSecondTeamList.adapter = secondTeamAdapter
        }
    }

    private fun showPlayerDetails(player: CustomPlayer) {
        val playerType: String = when(player.type){
            "Bowler" ->{
               "bowling style ${player.bowling.style}"
            }
            "Batsman" -> {
                "bowling style ${player.batting.style}"
            }
            "Wicketkeeper" -> {
                if(player.bowling.average > player.batting.average){
                    "bowling style ${player.bowling.style}"
                }else{
                    "bowling style ${player.batting.style}"
                }
            }
            "Captain" -> {
                if(player.bowling.average > player.batting.average){
                    "bowling style ${player.bowling.style}"
                }else{
                    "bowling style ${player.batting.style}"
                }
            }
            else -> {""}
        }
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Details")
            .setMessage("${player.fullName} is known as ${player.type} with $playerType")
            .setPositiveButton("GOT IT") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
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