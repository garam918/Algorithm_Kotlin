package Programmers.Level2

fun main() {
    println(solution(8,4,7))
}

private fun solution(n: Int, a: Int, b: Int): Int {
    var answer = 0

    var currentA = a
    var currentB = b

    while( currentA != currentB) {
        if( currentA % 2 == 1) currentA = (currentA / 2) + 1
        else currentA /= 2

        if( currentB % 2 == 1) currentB = (currentB / 2) + 1
        else currentB /= 2

        answer++
    }

    return answer
}