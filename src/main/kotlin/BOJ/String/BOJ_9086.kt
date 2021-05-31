package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString()
    println("${s.first()}${s.last()}")
}