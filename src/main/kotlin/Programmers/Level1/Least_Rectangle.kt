package Programmers.Level1

import java.util.*

fun main() {

    println(solution(arrayOf(intArrayOf(60,50),intArrayOf(30,70),intArrayOf(60,30),intArrayOf(80,40))))

}

private fun solution(sizes: Array<IntArray>): Int {

    val temp = Array(sizes.size) { intArrayOf()}

    sizes.forEachIndexed { i, ints ->
        val arr = ints.toMutableList()
        if(ints[0] < ints[1]) Collections.swap(arr,0,1)
        temp[i] = arr.toIntArray()
    }

    var w = 0
    var h = 0

    temp.forEach {

        if(w < it[0]) w = it[0]
        if(h < it[1]) h = it[1]
    }

    return w * h
}