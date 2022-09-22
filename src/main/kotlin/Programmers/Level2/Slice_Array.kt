package Programmers.Level2

import kotlin.math.floor

fun main() {
    println(solution(4,7,14).toList())
}

private fun solution(n: Int, left: Long, right: Long): IntArray {
    var answer: IntArray = intArrayOf()

    for(i in left .. right) {
        var j = floor((i / n).toDouble()) - i % n
        if(j < 0) j = 0.0

        answer += ((i % n) + 1 + j).toInt()

    }

    return answer
}