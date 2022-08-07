package Programmers

fun main() {
    println(solution(intArrayOf(4,3,2,1)).toList())
}

private fun solution(arr: IntArray) = if (arr.size == 1) intArrayOf(-1) else arr.filter { it != arr.minOrNull()!! }.toIntArray()