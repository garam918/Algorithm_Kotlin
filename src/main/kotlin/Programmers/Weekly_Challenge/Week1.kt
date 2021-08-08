package Programmers.Weekly_Challenge

import kotlin.math.absoluteValue

fun main() {
    println(solution(3,20,4))
}

private fun solution(price: Int, money: Int, count: Int): Long {
    var answer: Long = -1
    var temp : Long = 0
    repeat(count) {
        temp += (price * (it + 1))
    }
    answer = if(money - temp >= 0) 0
    else (money - temp).absoluteValue


    return answer
}