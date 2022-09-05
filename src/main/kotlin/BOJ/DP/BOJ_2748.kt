package BOJ.DP

fun main() = println(dp(readln().toInt()))

private val arr = LongArray(91)

private fun dp(x:Int) : Long {
    if(x == 0) return 0
    if(x == 1) return 1
    if(arr[x] != 0L) return arr[x]

    arr[x] = dp(x-1) + dp(x-2)

    return arr[x]
}