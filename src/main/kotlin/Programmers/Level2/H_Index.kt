package Programmers.Level2

fun main() {
    println(solution(intArrayOf(0,0,0)))
}

private fun solution(citations: IntArray): Int {
    var answer : Int

    val list = mutableMapOf<Int,Int>()

    citations.sortDescending()

    val max = citations.first()

    repeat(max) { i ->

        val count = citations.count { it >= (i+1) }
        if(i+1 <= count) list[i+1] = count
    }
    answer = if(list.isEmpty()) 0
    else list.filterKeys { it == list.maxByOrNull { it.key }!!.key }.keys.first()

    return answer
}