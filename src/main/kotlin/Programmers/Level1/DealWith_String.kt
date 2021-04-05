package Programmers.Level1

fun main() {
    println(solution("12134"))
}

private fun solution(s: String): Boolean {
    var answer = true

    if(s.length == 4 || s.length == 6) {

        try {
            s.toInt()
        } catch (t: NumberFormatException) {
            answer = false
        }
    }
    else answer = false
    return answer
}