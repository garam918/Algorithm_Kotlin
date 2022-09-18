package BOJ.DP

fun main() {
    val n = readln().toInt()
    val mod = 1000000007
    val arr = IntArray(51)

    arr[0] = 1
    arr[1] = 1

    repeat(n-1) { arr[it+2] = (arr[it+1] + arr[it] + 1) % mod }

    println(arr[n])
}