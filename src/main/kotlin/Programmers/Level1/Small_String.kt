package Programmers.Level1

fun main() = println(solution("10203","15"))

private fun solution(t: String, p: String): Int {
    var answer = 0

    repeat(t.length-p.length+1) {
        if(t.slice(IntRange(it,it+p.length-1)).toLong() <= p.toLong()) answer++
    }

    return answer
}