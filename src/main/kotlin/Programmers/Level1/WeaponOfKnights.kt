package Programmers.Level1

import kotlin.math.sqrt

fun main() = println(solution(5,3,2))

private fun solution(number: Int, limit: Int, power: Int): Int {
    var answer = 0

    repeat(number) { answer += divisor(it+1,limit,power) }

    return answer
}

private fun divisor(num : Int, limit: Int, power: Int) : Int {
    var count = 0

    for(i in 1 .. sqrt(num.toDouble()).toInt()) {
        if(num % i == 0) {
            count++
            if((i * i) != num) count++
        }
        if(count > limit) {
            count = power
            break
        }
    }

    return count
}