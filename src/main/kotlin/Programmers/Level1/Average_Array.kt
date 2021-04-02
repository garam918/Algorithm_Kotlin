package Programmers

fun main() {
    solution(intArrayOf(5,5))
}

private fun solution(arr: IntArray): Double {
    var answer = 0.0

    answer = arr.average()

    return answer
}