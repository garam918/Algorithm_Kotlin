package Programmers.Level1

fun main() = println(solution(intArrayOf(1,2,3,4,6,7,8,0)))

private fun solution(numbers: IntArray): Int {
    var answer = 0

    intArrayOf(0,1,2,3,4,5,6,7,8,9).forEach {
        if(!numbers.contains(it)) answer += it
    }

    return answer
}