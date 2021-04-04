package Programmers.Level1

import kotlin.math.pow

fun main() {
    solution(1)
}

private fun solution(n: Int): Int {
    var answer: Int = 0

    var i = n
    var k = 0
    val array = ArrayList<Int>()

    if ( n == 1) {
        array.add(n)
    }

    while(i > 1) {
        k = i % 3
        array.add(k)
        i /= 3
        if ( i == 1) {
            array.add(i)
        }
    }
    array.reverse()
    repeat(array.size) {
        answer += (array[it] * (3.0.pow(it))).toInt()

    }
    println(answer)

    return answer
}