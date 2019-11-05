package com.tjoeun.a20191105_01_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191105_01_listview.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var roomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRooms()

    }

//    Ex. 두 숫자(인자)의 합계를 리턴(Int)해주는 함수 생성.

//    void sum ( int num1, int num2) {
//
//    }

    fun sum(num1:Int, num2:Int) = num1 + num2


    fun addRooms()  {
        var room1 = RoomData()
        room1.price = 8000
        room1.address = "마포구 서교동"
        room1.floor = 1

        roomList.add(room1)


        var room2 = RoomData()
        room2.price = 28500
        room2.address = "마포구 서교동"
        room2.floor = 3
        roomList.add(room2)


        var room3 = RoomData()
        room3.price = 12000
        room3.address = "마포구 성산동"
        room3.floor = 5
        roomList.add(room3)
    }

}
