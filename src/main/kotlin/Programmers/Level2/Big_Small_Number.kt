package Programmers.Level2

fun main() {
    println(solution("-1 -2 -3 -4"))
}
private fun solution(s: String): String {
    var answer = ""

    var array = ArrayList<Int>()

    repeat(s.split(" ").size) {
        array.add(s.split(" ")[it].toInt())
    }

    answer = "${array.min()} ${array.max()}"

    return answer
}