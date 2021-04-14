package Programmers.Level2

fun main() {
    println(solution("3people unFo   llow  ed me"))
}

private fun solution(s: String): String {
    var answer = ""

    s.split(" ").mapIndexed { index, c ->
        if(c.isNotEmpty()) {

            answer += if(c.first().isLetter()) {
                c.first().toUpperCase()
            }else c.first()

        }

        repeat(c.length-1) {
            answer += c[it+1].toLowerCase()
        }
        answer += " "
    }

    return answer.slice(IntRange(0,answer.lastIndex-1))
}