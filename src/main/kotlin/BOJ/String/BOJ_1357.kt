package BOJ.String

fun main() {
    val n = readLine()!!.split(" ")
    val answer = n[0].reversed().toInt() + n[1].reversed().toInt()
    println(answer.toString().reversed().toInt())
}