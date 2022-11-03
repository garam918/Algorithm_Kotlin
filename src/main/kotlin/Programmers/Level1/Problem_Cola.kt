package Programmers.Level1

fun main() = println(solution(2,1,20))

private fun solution(a: Int, b: Int, n: Int): Int {
    var answer = 0

    var N = n

    while(N >= a) {
        answer += (N / a) * b
        N = N % a + (N / a) * b
    }

    return answer
}