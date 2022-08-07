package Programmers.Level2

fun main() {
    println(solution("-1 -2 -3 -4"))
}
private fun solution(s: String): String {
    val array = ArrayList<Int>()

    repeat(s.split(" ").size) {
        array.add(s.split(" ")[it].toInt())
    }

    return "${array.minOrNull()} ${array.maxOrNull()}"
}