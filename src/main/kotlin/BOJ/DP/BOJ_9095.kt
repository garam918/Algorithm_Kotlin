package BOJ.DP

private lateinit var arr : IntArray

fun main() = repeat(readln().toInt()) {
    arr = IntArray(11)
    println(dp(readln().toInt()))
}

private fun dp(x: Int) : Int {
    if(x == 1) return 1
    if(x == 2) return 2
    if(x == 3) return 4
    if(arr[x] != 0) return arr[x]

    arr[x] = dp(x-1) + dp(x-2) + dp(x-3)

    return arr[x]
}