package Programmers.Level1

fun main() = println(solution("a"))

private fun solution(s: String): Int {
    var answer = 0
    val str = s
    var first = str.first()
    var firstCount = 1
    var otherCount = 0

    if(str.length == 1) answer = 1
    for(i in 1 until str.length) {
        if(str[i] == first) firstCount++
        else otherCount++

        if(firstCount == otherCount) {
            answer++
            firstCount = 0
            otherCount = 0
            if(i+1 != str.length) first = str[i+1]
        }
        else if(i == str.length-1) answer++
    }

    return answer
}