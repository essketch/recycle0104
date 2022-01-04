package com.example.recycle0104.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle0104.R
import com.example.recycle0104.models.RoomData

class RoomAdapter(
    val mContext: Context,
    val mList: List<RoomData>,
) : RecyclerView.Adapter<RoomAdapter.MyViewHolder>() {
    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {
        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<TextView>(R.id.txtAddressAndFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        fun bind(data: RoomData) {
            txtDescription.text = data.description
            txtAddressAndFloor.text = "${data.address}, ${data.getFormattedFloor()}"
            txtPrice.text = data.getFormattedPrice()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}