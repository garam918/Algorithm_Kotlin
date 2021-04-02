package Programmers.Level1

fun main() {
    solution("-1234")
}

private fun solution(s: String): Int {
    var answer = 0

    answer = when {
        s.toInt() >= 0 -> {
            s.toInt()
        }
        else -> {
            -(s.replace("-","").toInt())
        }
    }
    println(answer)
    return answer
}