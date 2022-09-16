package BOJ.DP

private val arr = LongArray(36)

fun main() = println(dp(readln().toInt()))

private fun dp(x: Int) : Long {
    if(x == 0) return 1
    if(x == 1) return 1
    if(x == 2) return 2
    if(arr[x] != 0L) return arr[x]

    repeat(x) {
        arr[x] += dp(it) * dp(x-1-it)
    }

    return arr[x]
}