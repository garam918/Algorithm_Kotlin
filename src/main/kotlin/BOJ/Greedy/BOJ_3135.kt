package BOJ.Greedy

import kotlin.math.absoluteValue

fun main() {
    val s = readLine()!!.toString().split(" ")

    val a = s[0].toInt()
    val b = s[1].toInt()

    val n = readLine()!!.toInt()
    val list = arrayListOf<Int>()

    repeat(n) {
        val fre = readLine()!!.toInt()

        if((a - b).absoluteValue > (fre - b).absoluteValue) list.add((fre - b).absoluteValue)
    }

    val count = if(list.isEmpty()) (a-b).absoluteValue
    else list.minOrNull()!! + 1

    println(count)

}