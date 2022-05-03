package BOJ.Implementation

import kotlin.math.max

fun main() {

    val list = mutableListOf<Int>()

    repeat(readLine()!!.toString().toInt()) {
        val dice = readLine()!!.toString().split(" ")
        val a = dice[0].toInt()
        val b = dice[1].toInt()
        val c = dice[2].toInt()

        list.add(diceToReward(a,b,c))

    }

    println(list.maxOrNull())

}

private fun diceToReward(a: Int, b: Int, c: Int) : Int {
    var reward = 0

    when {
        a == b && b == c -> {
            reward = 10000 + (a * 1000)
        }
        a != b && a != c && b != c-> {
            reward = max(max(a,b),c) * 100
        }
        else -> {
            when {
                a == b -> {
                    reward = 1000 + (a * 100)
                }

                a == c -> {
                    reward = 1000 + (a * 100)
                }

                b == c -> {
                    reward = 1000 + (b * 100)
                }
            }
        }
    }

    return reward
}