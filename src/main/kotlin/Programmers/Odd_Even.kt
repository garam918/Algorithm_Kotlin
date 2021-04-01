package Programmers

fun main() {
    solution(0)
}

private fun solution(num: Int): String {
    var answer = ""

    answer = if( (num % 2) == 0) "Even"
    else "Odd"

    return answer
}