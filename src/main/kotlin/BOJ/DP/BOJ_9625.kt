package BOJ.DP

private val arr = IntArray(46)

fun main() {
    val k = readln().toInt()
    println("${dp(k-1)} ${dp(k)}")
}

private fun dp(x :Int) : Int {
    if(x == 0) return 0
    if(x == 1) return 1
    if(x == 2) return 1
    if(arr[x] != 0) return arr[x]

    arr[x] = dp(x-1) + dp(x-2)

    return arr[x]
}