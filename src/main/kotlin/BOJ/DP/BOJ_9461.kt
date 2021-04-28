package BOJ.DP

fun main() {

    val t = readLine()!!.toInt()
    repeat(t){
        val n = readLine()!!.toInt()
        println(dp(n))

    }

}

private var array = LongArray(100)

private fun dp(x: Int) : Long {
    if(x == 1) return 1
    if(x == 2) return 1
    if(x == 3) return 1
    if(x == 4) return 2
    if(x == 5) return 2
    if(array[x] != 0.toLong()) return array[x]

    array[x] = dp(x-1) + dp (x-5)

    return array[x]

}