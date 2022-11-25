package Programmers.Level1

fun main() = println(solution(3,4, intArrayOf(1, 2, 3, 1, 2, 3, 1)))

private fun solution(k: Int, m: Int, score: IntArray): Int {
    var answer = 0

    val list = mutableListOf<Int>()

    score.sortedArrayDescending().forEach {
        list.add(it)
        if(list.size == m) {
            answer += list.minOrNull()!! * m
            list.clear()
        }
    }

    return answer
}