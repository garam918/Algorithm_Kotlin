package Programmers

fun main() {
    solution(arrayOf("Jane","Kim"))
}

private fun solution(seoul: Array<String>): String {
    var answer = ""

    answer = "김서방은 ${seoul.indexOf("Kim")}에 있다"

    return answer
}