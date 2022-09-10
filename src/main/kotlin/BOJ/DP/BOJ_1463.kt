package BOJ.DP

import kotlin.math.min

fun main() = println(dp(readln().toInt()))

private val array = IntArray(1000001)

private fun dp(x: Int) : Int {
    if(x == 1) return 0
    if(array[x] != 0) return array[x]

    when {
        x % 6 == 0 -> array[x] = min(dp(x-1), min(dp(x/3), dp(x/2))) + 1
        x % 3 == 0 -> array[x] = min(dp(x/3), dp(x-1)) + 1
        x % 2 == 0 -> array[x] = min(dp(x/2), dp(x-1)) + 1
        else -> array[x] = dp(x-1) + 1

    }

    return array[x]
}