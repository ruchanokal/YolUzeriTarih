package com.ruchanokal.yoluzeritarih.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ruchanokal.yoluzeritarih.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private var binding: FragmentSettingsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding!!.kisiselBilgiler.setOnClickListener {

            val action = SettingsFragmentDirections.actionSettingsFragment2ToSettingDetailsFragment("kisisel")
            Navigation.findNavController(it).navigate(action)

        }

        binding!!.dilSecenekleri.setOnClickListener {

            val action = SettingsFragmentDirections.actionSettingsFragment2ToSettingDetailsFragment("dil")
            Navigation.findNavController(it).navigate(action)

        }

        binding!!.bildirimler.setOnClickListener {

            val action = SettingsFragmentDirections.actionSettingsFragment2ToSettingDetailsFragment("bildirim")
            Navigation.findNavController(it).navigate(action)

        }




        
    }


}