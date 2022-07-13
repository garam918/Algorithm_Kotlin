package Programmers.Level2

fun main() {

    println(solution(10,2).toList())
}

private fun solution(brown: Int, yellow: Int): IntArray {
    var answer = intArrayOf()

    val by = brown + yellow

    for(i in 1 .. brown / 2) {
        for(j in 1 .. i) {
            if((i * j) == by && i >= j && (i - 2) * (j - 2) == yellow) {
                answer += i
                answer += j
                break
            }
        }
    }

    return answer
}