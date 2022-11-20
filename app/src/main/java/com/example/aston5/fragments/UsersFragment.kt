package com.example.aston5.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aston5.R
import com.example.aston5.adapter.SimpleTreesAdapter
import com.example.aston5.data.Data
import com.example.aston5.user.User


class UsersFragment : Fragment(),SimpleTreesAdapter.onUserClickListener  {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_users, container, false)
        val myDataset = Data.Factory.users;

        val recyclerView = view.findViewById<RecyclerView>(R.id.listView)
        recyclerView.adapter = SimpleTreesAdapter(myDataset,
            this
        )
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
        // Inflate the layout for this fragment
        return view
    }
    override fun onItemClick(item: User, position: Int) {
        var bundle = bundleOf("name" to item.name,"surname" to item.surname,"number" to item.phoneNumber,"position" to position)
        view?.let { Navigation.findNavController(it).navigate(R.id.action_usersFragment_to_informationFragment,bundle) };
    }



}