package com.example.aston5.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.aston5.R
import com.example.aston5.data.Data


class InformationFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_information, container, false)
        view.findViewById<EditText>(R.id.name).setText(arguments?.getString("name"))
        view.findViewById<EditText>(R.id.surname).setText(arguments?.getString("surname"))
        view.findViewById<EditText>(R.id.phoneNumber).setText(arguments?.getString("number"))
        view.findViewById<Button>(R.id.button).setOnClickListener {
            Data.users[arguments?.getInt("position")!!].name = view.findViewById<EditText>(R.id.name).text.toString()
            Data.users[arguments?.getInt("position")!!].surname = view.findViewById<EditText>(R.id.surname).text.toString()
            Data.users[arguments?.getInt("position")!!].phoneNumber = view.findViewById<EditText>(R.id.phoneNumber).text.toString()
            Navigation.findNavController(view).navigate(R.id.action_informationFragment_to_usersFragment)
        }

        return view
    }


}