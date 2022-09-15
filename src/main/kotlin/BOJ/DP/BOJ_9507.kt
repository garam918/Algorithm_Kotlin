package BOJ.DP

private lateinit var arr : LongArray

fun main() = repeat(readln().toInt()) {
    val n = readln().toInt()
    arr = LongArray(n+1)

    println(koong(n))
}

private fun koong(x : Int) : Long {
    if(x < 2) return 1
    if(x == 2) return 2
    if(x == 3) return 4
    if(arr[x] != 0L) return arr[x]

    arr[x] = koong(x - 1) + koong(x - 2) + koong(x - 3) + koong(x - 4)

    return arr[x]
}