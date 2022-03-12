package com.ruchanokal.yoluzeritarih.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ruchanokal.yoluzeritarih.databinding.RecyclerRowBinding
import com.ruchanokal.yoluzeritarih.fragments.SearchFragmentDirections

class RecyclerViewAdapter(private var mekanList : ArrayList<String>) : RecyclerView.Adapter<RecyclerViewAdapter.SearchViewHolder>() {

    class SearchViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SearchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {


        holder.binding.textViewRow.text = mekanList.get(position)
        holder.binding.textViewRow.setOnClickListener {

            var ilceAdi = ""

            when(mekanList.get(position)){

                "Yeşilköy" -> ilceAdi = "yesilkoy"
                "Fatih" -> ilceAdi = "fatih"
                "Arnavutköy" -> ilceAdi = "arnavutkoy"
                "Beşiktaş" -> ilceAdi = "besiktas"
                "Eminönü" -> ilceAdi = "eminonu"
                "Beyoğlu" -> ilceAdi = "beyoglu"
                "Üsküdar" -> ilceAdi = "uskudar"

                else -> {

                    ilceAdi = "yesilkoy"
                }

            }

            val action = SearchFragmentDirections.actionSearchFragment2ToDetailsFragment(ilceAdi)
            Navigation.findNavController(it).navigate(action)
        }


    }

    override fun getItemCount(): Int {
        return mekanList.size
    }

    fun filterList(filteredList : ArrayList<String>) {
        mekanList = filteredList
        notifyDataSetChanged()
    }


}