package BOJ.Implementation

import kotlin.math.sqrt

fun main() {

    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    var min = 0
    var sum = 0

    repeat(n-m + 1) {
        val a = n - it

        if(sqrt(a.toDouble()).toString().length <= 5) {
            sum += a
            min = a
        }
    }

    if(sum == 0) println(-1)
    else {
        println(sum)
        println(min)
    }
}