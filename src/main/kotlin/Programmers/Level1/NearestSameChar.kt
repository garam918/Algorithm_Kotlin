package Programmers.Level1

fun main() = println(solution("foobar").toList())

private fun solution(s: String): IntArray {
    var answer = intArrayOf()

    val map = mutableMapOf<Char,Int>()

    s.forEachIndexed { index, c ->
        if(map.containsKey(c)) {
            answer += index - map[c]!!
            map[c] = index
        }
        else {
            answer += -1
            map[c] = index
        }
    }

    return answer
}