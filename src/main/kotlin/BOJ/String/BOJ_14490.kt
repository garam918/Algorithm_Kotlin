package BOJ.String

import kotlin.math.max

fun main() {
    val s = readLine()!!.toString().split(":")

    val n = s[0].toInt()
    val m = s[1].toInt()

    var temp = 0

    for(i in 1 .. max(n,m)) {
        if( (n % i == 0) && (m % i == 0)) temp = i
    }

    val a = n/temp
    val b = m/temp

    println("$a:$b")

}