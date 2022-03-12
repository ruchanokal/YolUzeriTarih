package com.ruchanokal.yoluzeritarih.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ruchanokal.yoluzeritarih.R
import com.ruchanokal.yoluzeritarih.databinding.FragmentSettingDetailsBinding
import com.ruchanokal.yoluzeritarih.databinding.FragmentSettingsBinding


class SettingDetailsFragment : Fragment() {


    private lateinit var preferences : SharedPreferences

    private var binding: FragmentSettingDetailsBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingDetailsBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        preferences = requireActivity().getSharedPreferences("com.ruchanokal.yoluzeritarih", Context.MODE_PRIVATE)


        arguments?.let {

            val ayar = SettingDetailsFragmentArgs.fromBundle(it).ayar

            if (ayar.equals("kisisel")){

                binding!!.kisiselBilgilerLayout.visibility = View.VISIBLE
                binding!!.dilSecenekleriLayout.visibility = View.GONE
                binding!!.bildirimlerLayout.visibility = View.GONE

            } else if (ayar.equals("dil")){

                binding!!.kisiselBilgilerLayout.visibility = View.GONE
                binding!!.dilSecenekleriLayout.visibility = View.VISIBLE
                binding!!.bildirimlerLayout.visibility = View.GONE

            } else if (ayar.equals("bildirim")){

                binding!!.kisiselBilgilerLayout.visibility = View.GONE
                binding!!.dilSecenekleriLayout.visibility = View.GONE
                binding!!.bildirimlerLayout.visibility = View.VISIBLE
            }



            val radioChecked = preferences.getInt("radioChecked" , 2131362340)
            val switchChecked = preferences.getBoolean("switchChecked" , false)

            binding!!.radioGroup.check(radioChecked)
            binding!!.bildirimSwitch.isChecked = switchChecked


//            if (radioChecked == 2131362340) {
//                binding!!.radioGroup.check(radioChecked)
//            } else if (radioChecked == 2131362368) {
//                binding!!.radioGroup.check(radioChecked)
//            } else if (radioChecked == 2131362367) {
//                binding!!.radioGroup.check(radioChecked)
//            }


            binding!!.radioGroup.setOnCheckedChangeListener { radioGroup, i ->

                    Log.i("Settings","i: " + i)
                    preferences.edit().putInt("radioChecked",i).apply()

            }


            binding!!.bildirimSwitch.setOnCheckedChangeListener { compoundButton, b ->

                    Log.i("Settings","isChecked switch: " + b)
                    preferences.edit().putBoolean("switchChecked",b).apply()
            }


            binding!!.geriButonu.setOnClickListener {

                findNavController().popBackStack()

            }


        }
    }
}