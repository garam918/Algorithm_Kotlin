package BOJ.DP

private var array = Array(41) { "" }

fun main() = repeat(readLine()!!.toInt()) { println(fibonacci(readLine()!!.toInt())) }

private fun fibonacci(n: Int) : String {
    if (n == 0) return "1 0"
    if (n == 1) return "0 1"

    if ( array[n] != "" ) return array[n]

    val (n1zero, n1one)= fibonacci(n-1).split(" ")
    val (n2zero, n2one) = fibonacci(n-2).split(" ")

    array[n] = "${(n1zero.toInt() + n2zero.toInt())} ${n1one.toInt() + n2one.toInt()}"

    return array[n]
}