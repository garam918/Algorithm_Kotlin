package Programmers

fun main() {
    solution(987)
}

private fun solution(n: Int): Int {
    var answer = 0

    val temp = n.toString()

    repeat(temp.length) {
        answer += temp.slice(IntRange(it,it)).toInt()

    }
    println(answer)
    return answer
}