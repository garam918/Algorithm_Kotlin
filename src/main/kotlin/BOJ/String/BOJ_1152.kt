package BOJ.String

fun main() {
    val s = readLine()!!.toString()
    if(s.isBlank()) println(0)
    else println(s.trimEnd().trimStart().split(" ").size)
}