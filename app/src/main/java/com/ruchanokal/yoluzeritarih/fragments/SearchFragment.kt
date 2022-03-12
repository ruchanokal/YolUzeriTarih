package com.ruchanokal.yoluzeritarih.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.ruchanokal.yoluzeritarih.R
import com.ruchanokal.yoluzeritarih.adapter.RecyclerViewAdapter
import com.ruchanokal.yoluzeritarih.databinding.FragmentSearchBinding
import java.util.*


class SearchFragment : Fragment() {

    private var binding: FragmentSearchBinding? = null
    private var arrayList = arrayListOf<String>()
    private lateinit var adapter : RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        arrayList = arrayListOf<String>("Yeşilköy","Fatih","Arnavutköy","Beşiktaş","Eminönü","Beyoğlu","Üsküdar")

        binding!!.recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        adapter = RecyclerViewAdapter(arrayList)
        binding!!.recyclerView.adapter = adapter

        binding!!.searchEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                filterMethod(s)
            }
        })

    }

    private fun filterMethod(s: CharSequence?) {


        val newList = arrayListOf<String>()

        for (a in arrayList) {

            if (s.toString().lowercase(Locale.getDefault()).let { a.lowercase(Locale.getDefault()).contains(it) } == true) {

                newList.add(a)

            }

        }

        adapter.filterList(newList)


    }


}