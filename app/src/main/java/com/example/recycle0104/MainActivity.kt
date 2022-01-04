package com.example.recycle0104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycle0104.Adapters.RoomAdapter
import com.example.recycle0104.models.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000, "00시 00구", 5, "1번째 방"))
        mRoomList.add(RoomData(12345, "00시 00구", 5, "2번째 방"))
        mRoomList.add(RoomData(14643, "00시 00구", 5, "3번째 방"))
        mRoomList.add(RoomData(24574, "00시 00구", 5, "4번째 방"))
        mRoomList.add(RoomData(4633, "00시 00구", 5, "5번째 방"))
        mRoomList.add(RoomData(7699, "00시 00구", 5, "6번째 방"))
        mRoomList.add(RoomData(35466, "00시 00구", 5, "7번째 방"))
        mRoomList.add(RoomData(12352, "00시 00구", 5, "8번째 방"))
        mRoomList.add(RoomData(66666, "00시 00구", 5, "9번째 방"))

        mRoomAdapter = RoomAdapter(this, mRoomList)
        roomRecyclerView.adapter = mRoomAdapter
        roomRecyclerView.layoutManager = LinearLayoutManager(this)

    }
}