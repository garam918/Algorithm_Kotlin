package BOJ.String

import kotlin.math.absoluteValue
import kotlin.math.pow

fun main() {
    repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toString()
        var temp = 0
        var t = 0
        s.split("-").forEachIndexed { index, str ->
            when( index ) {
                0 -> {
                    str.forEachIndexed { i, c ->
                        temp += (c.toInt() - 65) * ((26.0).pow(2 - i)).toInt()
                    }
                }
                1 -> {
                    t = str.toInt()
                }
            }
        }
        if((temp - t).absoluteValue <= 100) println("nice")
        else println("not nice")
    }
}