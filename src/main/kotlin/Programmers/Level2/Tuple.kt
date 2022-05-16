package Programmers.Level2

fun main() {
    println(solution("{{20,111},{111}}").toList())
}

private fun solution(s: String): IntArray {
    var answer = intArrayOf()

    s.slice(IntRange(2,s.length-3)).split("},{").sortedBy { it.length }.forEach{ c ->
        c.split(",").forEach {
            if(!answer.contains(it.toInt())) answer += it.toInt()
        }
    }

    return answer
}