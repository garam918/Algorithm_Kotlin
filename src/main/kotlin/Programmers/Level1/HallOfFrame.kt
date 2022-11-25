package Programmers.Level1

fun main() = println(solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)).toList())

private fun solution(k: Int, score: IntArray): IntArray {
    var answer = intArrayOf()

    val list = mutableListOf<Int>()

    score.forEachIndexed { index, i ->
        answer += if(index < k) {
            list.add(i)
            list.minOrNull()!!
        } else {
            val min = list.minOrNull()!!
            if(i > min) {
                list.remove(min)
                list.add(i)
                list.minOrNull()!!
            } else list.minOrNull()!!
        }
    }

    return answer
}