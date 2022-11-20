package com.example.aston5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.aston5.R
import com.example.aston5.user.User

class SimpleTreesAdapter(
    private val users: List<User>,
    private val clickListener: onUserClickListener
) : RecyclerView.Adapter<SimpleTreesAdapter.SimpleTreesViewHolder>() {
interface  onUserClickListener{
    fun onItemClick(item: User, position: Int)


}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleTreesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false)
        return SimpleTreesViewHolder(view)
    }

    override fun onBindViewHolder(holder: SimpleTreesViewHolder, position: Int) {
        val user = users[position]
        holder.names.text = user.name
       holder.surname.text = user.surname
       holder.phoneNumber.text = user.phoneNumber.toString()
        holder.initialize(users[position],clickListener)
    }

    override fun getItemCount(): Int = users.size


    class SimpleTreesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val names: TextView = itemView.findViewById(R.id.name)
        val surname: TextView = itemView.findViewById(R.id.surname)
        val phoneNumber: TextView = itemView.findViewById(R.id.phoneNumber)
        fun initialize(item: User, action:onUserClickListener){
            itemView.setOnClickListener{
                names.text = item.name
                surname.text = item.surname
                phoneNumber.text = item.phoneNumber.toString()
                action.onItemClick(item,adapterPosition)
            }
        }
    }


}
