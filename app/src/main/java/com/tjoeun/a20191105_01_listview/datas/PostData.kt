package com.tjoeun.a20191105_01_listview.datas

import android.util.Log

class PostData(inputTitle:String, inputContent:String) {

    var title = inputTitle
    var content = inputContent

    init {
        Log.d("게시글생성", "기본생성자로 생성")
    }

}