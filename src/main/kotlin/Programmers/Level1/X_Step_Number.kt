package Programmers

import kotlin.collections.LinkedHashMap
import kotlin.math.absoluteValue

fun main() {
    solution(0,5)
}

private fun solution(x: Int, n: Int): LongArray {
    var answer = longArrayOf()

    val hash = LinkedHashMap<Long,Long>()
    val k : Long = (x.toLong() * n)

    if(n in 1 .. 1000 && x in -10000000 .. 10000000) {
        when {
            x == 0 -> {
                for(i in 0 until n) {
                    hash[i.toLong()] = 0
                }
                answer = hash.values.toLongArray()
            }

            x > 0 -> {
                for (i in x..k step x.toLong()) {
                    hash[i] = i
                }

                answer = hash.values.toLongArray()
            }
            x < 0 -> {
                for (i in k..x step x.toLong().absoluteValue) {
                    hash[i] = i
                }

                answer = hash.values.toLongArray().sortedArrayDescending()
            }
        }
    }
    println(answer.toList())
    return answer
}