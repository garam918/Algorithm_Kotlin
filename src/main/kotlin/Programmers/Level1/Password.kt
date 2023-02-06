package Programmers.Level1

fun main() = println(solution("z","abcdefghij",20))

private fun solution(s: String, skip: String, index: Int): String {
    var answer = ""

    s.forEach {
        var c = it
        var ind = 1
        var cnt = 0

        while(cnt < index) {
            ind = if(ind > 26) 1
            else ind

            c = if(it + ind > 'z') it - 26 + ind
            else it+ind

            if(!skip.contains(c)) cnt++

            ind++
        }

        answer += c
    }

    return answer
}