package BOJ.Implementation

import kotlin.math.round

fun main() = repeat(readLine()!!.toInt()) { println("$${String.format("%.2f",round(readLine()!!.toDouble() * (0.8).toDouble() * 1000 )/ 1000 )}") }