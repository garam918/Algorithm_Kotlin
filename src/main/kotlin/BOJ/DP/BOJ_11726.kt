package BOJ.DP

fun main() = println(dp(readln().toInt()))

private val array = IntArray(1001)

private fun dp(x: Int) : Int{
    if(x == 1) return 1
    if(x == 2) return 2
    if(x == 3) return 3
    if(array[x] != 0) return array[x]

    array[x] = (dp(x-1) + dp(x-2)) % 10007

    return array[x]
}