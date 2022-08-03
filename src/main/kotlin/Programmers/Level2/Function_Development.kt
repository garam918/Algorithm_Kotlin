package Programmers.Level2

fun main() {

    println(solution(intArrayOf(20, 99, 93, 30, 55, 10), intArrayOf(5, 10, 1, 1, 30, 5)).toList())

}

private fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    var answer = intArrayOf()

    val stack = ArrayDeque<MutableList<Int>>()

    progresses.forEachIndexed { index, i ->
        val day = if((100 - i) % speeds[index] == 0) (100 - i) / speeds[index]
        else (100 - i) / speeds[index] + 1

        if(index == 0) stack.add(mutableListOf(day))
        else {
            if(stack.maxByOrNull { it.maxOrNull()!! }!!.first() < day) stack.add(mutableListOf(day))
            else stack.last().add(day)
        }
    }

    stack.forEach { answer += it.size }

    return answer
}