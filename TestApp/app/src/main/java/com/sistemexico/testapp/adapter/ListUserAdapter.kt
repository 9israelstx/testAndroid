package com.sistemexico.testapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sistemexico.testapp.R
import com.sistemexico.testapp.services.response.UserResponse

class ListUserAdapter (var adapterModel: MutableList<UserResponse>, private val listener: OnItemCLickListener):
    RecyclerView.Adapter<ListUserAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {
        val name: TextView = itemView.findViewById(R.id.lblName)
        val email: TextView = itemView.findViewById(R.id.lblEmail)
        val avatar: ImageView = itemView.findViewById(R.id.imgAvatar)


        init {
            val position = adapterPosition

            itemView.setOnClickListener { v: View ->
                v.setOnClickListener(this)
                listener.onItemClick(v,position,adapterModel[position])
            }
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            when(v?.id){

            }
        }
    }
    interface  OnItemCLickListener{
        fun onItemClick(v: View, position: Int, data: UserResponse)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.user_contact_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = adapterModel[position]

        holder.name.text ="${data.first_name} ${data.last_name}"
        holder.email.text = data.email

        val options = RequestOptions()
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher_round)
        Glide.with(holder.avatar.context).load(data.avatar).apply(options).into(holder.avatar)

    }

    override fun getItemCount(): Int {
        return adapterModel.size
    }


    fun addItem(item: UserResponse) {
        this.adapterModel.add(item)
        notifyItemInserted(adapterModel.size)
    }

    fun removeItem(position: Int) {
        notifyItemInserted(adapterModel.size)
        this.adapterModel.removeAt(position)
        notifyItemRemoved(position)
    }
}

