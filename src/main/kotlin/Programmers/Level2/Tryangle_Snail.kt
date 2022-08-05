package Programmers.Level2

fun main() {
    println(solution(5).toList())
}

private fun solution(n: Int): IntArray {
    var answer = intArrayOf()

    val temp = Array(n) { IntArray(n) }

    repeat(n) { temp[it] = IntArray(it+1) }

    var num = 1
    var x = -1
    var y = 0

    for(i in 0 until n) {
        for(j in i until n) {
            when(i % 3) {
                0 -> x++
                1 -> y++
                2 -> {
                    x--
                    y--
                }
            }
            temp[x][y] = num++
        }
    }

    temp.forEach { answer += it }

    return answer
}