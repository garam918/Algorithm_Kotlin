package BOJ.DP

fun main() {
    val k = readLine()!!.toLong()
    println(dp(k) % 15746)
}

private var array = LongArray(1000001)

private fun dp(n: Long) : Long {
    if(n == 1.toLong()) return 1
    if(n == 2.toLong()) return 2
    if(array[n.toInt()] != 0.toLong()) return array[n.toInt()] % 15746

    array[n.toInt()] = (dp(n-1) % 15746) + ( dp(n-2) % 15746)

    return (array[n.toInt()] % 15746)
}