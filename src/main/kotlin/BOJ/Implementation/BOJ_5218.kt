package BOJ.Implementation

import kotlin.math.absoluteValue

fun main() = repeat(readLine()!!.toInt()) {

    val ab = readLine()!!.split(" ")
    val a = ab[0]
    val b = ab[1]

    print("Distances: ")

    a.forEachIndexed { index, c ->
        if(c <= b[index]) print((c-b[index]).absoluteValue)
        else print((b[index]+26 - c).absoluteValue)

        print(" ")
    }
    println()
}
