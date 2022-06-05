package BOJ.BruteForce

import kotlin.math.absoluteValue

fun main() {

    var temp = 0
    val list = mutableMapOf<Int,Int>()

    repeat(10) {

        temp += readLine()!!.toInt()

        list[(temp-100)] = temp

    }

    println(list.toList().filter { it.first.absoluteValue == list.entries.minOf { it.key.absoluteValue } }.maxOf { it.second })

}