package Programmers.Level2

fun main() = println(solution(2, intArrayOf(1,1,1,1,2,2,2,3)))

private fun solution(k: Int, tangerine: IntArray): Int {
    var answer = 0

    var temp = 0
    val map = mutableMapOf<Int,Int>()

    tangerine.forEach {
        if(map.containsKey(it)) map[it] = map[it]!! + 1
        else map[it] = 1
    }

    map.toList().sortedByDescending { it.second }.forEach { (_, u) ->
        if(temp < k) {
            temp += u
            answer++
        }
    }

    return answer
}