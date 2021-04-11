package Programmers.Level1

fun main() {
    println(solution("Zbcdefg"))
}

private fun solution(s: String): String {
    var answer = ""

    val test = s.toCharArray()

    repeat(s.length) {
        answer += test.sortedDescending().toList()[it]
    }

    return answer
}