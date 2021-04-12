package Programmers.Level1

fun main() {
    println(solution(intArrayOf(1,2,3,4), intArrayOf(-3,-1,0,2)))
}

private fun solution(a: IntArray, b: IntArray): Int {
    var answer = 0

    repeat(a.size) {
        answer += a[it] * b [it]
    }

    return answer
}