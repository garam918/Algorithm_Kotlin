package Programmers.Level1

fun main() = println(solution(intArrayOf(-1,1,-1,1)))

private fun solution(number: IntArray): Int {
    var answer = 0

    for(i in 0 .. number.size-3) {
        for(j in i + 1 .. number.size-2) {
            for (k in j + 1 until number.size) if(number[i] + number[j] + number[k] == 0) answer++
        }
    }

    return answer
}