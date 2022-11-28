package Programmers.Level0

fun main() = println(solution("hello","ohell"))

private fun solution(A: String, B: String): Int {
    var answer = -1
    var temp = A

    for(i in 1 .. A.length) {
        temp = temp.last() + temp.dropLast(1)
        if(temp == B) {
            answer = i
            break
        }
    }

    if(A == B) answer = 0

    return answer
}