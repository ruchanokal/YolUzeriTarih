package com.ruchanokal.yoluzeritarih.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.ruchanokal.yoluzeritarih.R
import com.ruchanokal.yoluzeritarih.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //binding.bottomNavigationView.setOnNavigationItemSelectedListener(navListener)

//        supportFragmentManager.beginTransaction().add(R.id.fragment_container, MainFragment())
//            .commit()


        //val navController = findNavController(R.id.fragmentContainerView)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavigationView.setupWithNavController(navController)


    }


//        private val navListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//            var selectedFragment: Fragment? = null
//            when (item.itemId) {
//                R.id.anaFragment -> selectedFragment = MainFragment()
//                R.id.searchFragment -> selectedFragment = SearchFragment()
//                R.id.mapFragment -> selectedFragment = MapFragment()
//                R.id.settingsFragment -> selectedFragment = SettingsFragment()
//            }
//
//            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
//                selectedFragment!!).commit()
//            true
//        }


}