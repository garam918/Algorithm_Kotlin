package Programmers.Level1

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    solution(121)
}

private fun solution(n: Long): Long {
    var answer: Long = -1

    for(i in 1 .. n) {
        if( i.toFloat().equals(sqrt(n.toFloat()))) {
            answer = (i.toDouble()+1).pow(2).toLong()
            break
        }
    }

    return answer
}