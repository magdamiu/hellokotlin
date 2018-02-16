package com.magdamiu.hellokotlin

/**
 * Created by magda on 16/02/2018.
 */

fun myFunction() = 6

var myInt: Int = 5

fun theFunction() {
    myInt = 2;
    val myLong: Long = myInt.toLong()

    val string = "This is my Long: $myLong"

    val myList: List<Int> = listOf(3, 1, 4, 6)
}


fun testList() {
    val listOfInt: List<Int> = listOf(1, 2, 3)
    var integerValue = listOfInt[0]
    val list: List<String> = listOfInt.filter { it % 2 == 0 }
            .map { it.toString() }
}

fun testMediaItemList(){
    val list: List<MediaItem> = emptyList()
    val listOfUrl = list.filter { it.url.isNotEmpty() }
            .sortedBy { it.title }
            .map{it.url}

    for(i in 1..10){

    }
}
