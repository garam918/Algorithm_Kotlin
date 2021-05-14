package Programmers.Level1

fun main() {
    println(solution(24,27))
}

private fun solution(left: Int, right: Int): Int {
    var answer = 0

    for(i in left .. right) {
        var count = 0

        for(j in 1 .. i) {
            if(i % j == 0) count++
        }
        if(count % 2 == 0) answer += i
        else answer -= i

    }

    return answer
}