package Programmers

fun main() {
    solution(5)
}

private fun solution(n: Int): Int {
    var answer = 0

    for(i in 1 .. n) {
        if( n % i == 0) {
            answer += i
        }
    }

    return answer
}