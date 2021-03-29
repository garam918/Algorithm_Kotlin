package Programmers

fun main() {
    solution("qwer")
}

private fun solution(s: String): String {
    var answer = ""

    var length = s.length

    when(length % 2) {
        0 -> {
            answer = s.slice(IntRange((length/2)-1,length/2))
        }

        1 -> {
            answer = s.slice(IntRange(length/2,length/2))
        }

    }

    return answer
}
