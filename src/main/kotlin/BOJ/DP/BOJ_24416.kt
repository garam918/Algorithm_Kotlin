package BOJ.DP

private val arr = IntArray(41)

private var recursionCount = 1
private var dpCount = 0

fun main() {
    val n = readln().toInt()
    recursion(n)
    dp(n)

    println("$recursionCount $dpCount")
}

private fun recursion(n :Int) : Int =
    if(n == 1 || n == 2) 1
    else {
        recursionCount++
        recursion(n-1) + recursion(n-2)
    }


private fun dp(n: Int) : Int {
    if(n == 1) return 1
    if(n == 2) return 1
    for(i in 3 .. n) {
        dpCount++
        arr[i] = arr[i-1] + arr[i-2]
    }

    return arr[n]
}