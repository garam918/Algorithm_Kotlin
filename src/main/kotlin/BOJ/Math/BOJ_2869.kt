package BOJ.Math

fun main() {

    val (a,b,v) = readln().split(" ").map { it.toInt() }

    println((v - b - 1) / (a-b) + 1)
}