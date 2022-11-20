package com.example.aston5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.aston5.adapter.SimpleTreesAdapter
import com.example.aston5.data.Data
import com.example.aston5.fragments.InformationFragment
import com.example.aston5.fragments.UsersFragment
import com.example.aston5.user.User

class MainActivity : AppCompatActivity(), SimpleTreesAdapter.onUserClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onItemClick(item: User, position: Int) {
        Toast.makeText(applicationContext, item.name, Toast.LENGTH_SHORT).show()

    }
}