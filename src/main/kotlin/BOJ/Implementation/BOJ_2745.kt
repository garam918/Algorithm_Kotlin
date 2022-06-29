package BOJ.Implementation

fun main() {
    val nb = readLine()!!.split(" ")
    val n = nb[0]
    val b = nb[1].toInt()

    println(Integer.parseInt(n,b).toString(10))
}