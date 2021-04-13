package Programmers.Level1

fun main() {
    println(solution(2,5).toList())
}

private fun solution(n: Int, m: Int): IntArray {
    var answer = intArrayOf()

    var k = if(n > m) n else m

    for(i in k downTo 1) {
        if(n % i == 0 && m % i == 0) {
            answer = intArrayOf(i)
            break
        }
    }
    for(i in k .. n*m) {
        if(i % n == 0 && i % m == 0) {
            answer += intArrayOf(i)
            break
        }
    }

    return answer
}