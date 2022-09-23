package Programmers.Level2

import kotlin.math.sqrt

fun main() {

    println(solution(437674,3))

}

private fun solution(n: Int, k: Int): Int {
    var answer = 0

    n.toString(k).split("0").forEach {
        if(!it.isNullOrBlank() && isPrime(it.toLong())) answer++
    }

    return answer
}

private fun isPrime(x: Long) : Boolean {
    var isPrime = true
    if (x == 1L) isPrime = false
    else {
        for(i in 2 .. sqrt(x.toDouble()).toInt()) {
            if(x % i == 0L) {
                isPrime = false
                break
            }
        }
    }


    return isPrime
}