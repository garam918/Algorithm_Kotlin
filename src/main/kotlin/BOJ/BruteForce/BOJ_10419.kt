package BOJ.BruteForce

import kotlin.math.pow

fun main() = repeat(readLine()!!.toInt()) {
    val d = readLine()!!.toInt()
    var max = 0
    for(i in 1 .. d) {
        if(i + i.toDouble().pow(2) <= d) max = i
        else break

    }
    println(max)
}
