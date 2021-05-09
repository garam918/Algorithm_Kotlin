package BOJ.DP

fun main() {

    val n = readLine()!!.toInt()
    println(dp(n))

}

private var array = IntArray(1001)

private fun dp(x: Int): Int {
    if(x == 1) return 1
    if(x == 2) return 3
    if(array[x] != 0) return array[x]

    array[x] = (dp(x-1) + (2 * dp(x-2))) % 10007
    return array[x]
}