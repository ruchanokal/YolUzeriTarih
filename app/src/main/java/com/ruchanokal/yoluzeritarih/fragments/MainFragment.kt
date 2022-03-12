package com.ruchanokal.yoluzeritarih.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ruchanokal.yoluzeritarih.R
import com.ruchanokal.yoluzeritarih.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding!!.map.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToMapsFragment()
            Navigation.findNavController(it).navigate(action)

        }


        binding!!.besiktasLayout.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToDetailsFragment("besiktas")
            Navigation.findNavController(it).navigate(action)

        }

        binding!!.fatihLayout.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToDetailsFragment("fatih")
            Navigation.findNavController(it).navigate(action)

        }

        binding!!.arnavutkoyLayout.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToDetailsFragment("arnavutkoy")
            Navigation.findNavController(it).navigate(action)

        }


        binding!!.beyogluLayout.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToDetailsFragment("beyoglu")
            Navigation.findNavController(it).navigate(action)

        }

        binding!!.uskudarLayout.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToDetailsFragment("uskudar")
            Navigation.findNavController(it).navigate(action)

        }

        binding!!.eminonuLayout.setOnClickListener {

            val action = MainFragmentDirections.actionMainFragmentToDetailsFragment("eminonu")
            Navigation.findNavController(it).navigate(action)

        }



    }


}