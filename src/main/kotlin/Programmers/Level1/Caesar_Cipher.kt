package Programmers.Level1

fun main() {
    println(solution("a B z",4))
}

private fun solution(s: String, n: Int): String {
    var answer = ""

    if(s.length <= 8000 && n in 1 .. 25) {

        repeat(s.length) {
            var temp = s[it].toInt()
            answer += when (temp) {
                in 97 .. 122 -> {
                    if(temp + n > 122) {
                        (temp + n -26).toChar()
                    }else (temp+n).toChar()
                }
                in 65 .. 90 -> {
                    if(temp + n > 90) {
                        (temp+n -26).toChar()
                    }else (temp+n).toChar()
                }
                32 -> {
                    32.toChar()
                }
                else -> {

                }
            }
        }
    }

    return answer
}