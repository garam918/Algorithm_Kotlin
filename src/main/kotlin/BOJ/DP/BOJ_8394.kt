package BOJ.DP

fun main() {
    val arr = IntArray(10000001)
    val n = readln().toInt()

    arr[1] = 1
    arr[2] = 2

    repeat(n-2) { arr[it+3] = (arr[it+2] % 10 + arr[it+1] % 10) % 10 }

    println(arr[n])
}