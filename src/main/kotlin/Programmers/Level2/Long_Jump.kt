package Programmers.Level2

fun main() {

    println(solution(6))

}

private lateinit var arr : LongArray

private fun solution(n: Int): Long {

    arr = LongArray(n+1)

    arr[1] = 1
    if(n != 1) arr[2] = 2

    return dp(n)
}

private fun dp(x: Int) : Long{
    if(arr[x] == 1L) return 1
    if(arr[x] == 2L) return 2
    if(arr[x] != 0L) return arr[x] % 1234567

    arr[x] = (dp(x-1) % 1234567) + (dp(x-2) % 1234567)

    return arr[x] % 1234567
}