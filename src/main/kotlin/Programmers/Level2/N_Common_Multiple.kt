package Programmers.Level2

fun main() {
    println(solution(intArrayOf(2,6,8,14)))
}

private fun solution(arr: IntArray): Long {
    var answer : Long = 0

    var max : Long = 1

    arr.forEach { max *= it }

    for(i in arr.maxOrNull()!! .. max) {
        if(arr.find { i % it != 0.toLong() } == null) {
            answer = i
            break
        }
    }
    return answer
}