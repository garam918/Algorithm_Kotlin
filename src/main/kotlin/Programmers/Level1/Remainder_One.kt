package Programmers.Level1

fun main() {

    println(solution(1000000))

}

private fun solution(n: Int): Int {
    var answer = 0

    val list = mutableListOf<Int>()

    repeat(n) {
        if( n % (it + 1) == 1) list.add(it+1)
    }

    answer = list.minOrNull()!!

    return answer
}