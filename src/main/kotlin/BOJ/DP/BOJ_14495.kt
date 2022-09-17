package BOJ.DP

fun main() = println(dp(readln().toInt()))

private val arr = LongArray(117)

private fun dp(x: Int) : Long {
    if(x == 1 || x == 2 || x == 3) return 1
    if(arr[x] != 0L) return arr[x]

    arr[x] = dp(x-1) + dp(x-3)

    return arr[x]
}