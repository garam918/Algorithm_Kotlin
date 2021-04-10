package Programmers.Level1

fun main() {
    println(solution("    fDgdG    "))
}

private fun solution(s: String): String {
    var answer = ""

    s.split(" ").mapIndexed { index, c ->
        repeat(c.length) {
            answer += if (it % 2 == 0) c[it].toUpperCase()
            else c[it].toLowerCase()
        }
        answer += " "
    }
    return answer.slice(IntRange(0,answer.lastIndex-1))
}