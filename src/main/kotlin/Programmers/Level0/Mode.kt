package Programmers.Level0

fun main() = println(solution(intArrayOf(1)))

private fun solution(array: IntArray): Int {
    val answer: Int
    val map = mutableMapOf<Int,Int>()

    array.forEach {
        if(map.containsKey(it)) map[it] = map[it]!! + 1
        else map[it] = 1
    }

    val max = map.values.maxByOrNull { it }
    answer = if(map.filter { it.value == max }.size >= 2) -1
    else map.filter { it.value == max }.keys.first()

    return answer
}