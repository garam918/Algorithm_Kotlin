package Programmers.Level1

fun main() {
    solution(-100000000,3)
}

private fun solution(a: Int, b: Int): Long {
    var answer: Long = 0

    when {
        a > b -> {
            for(i in b .. a) {
                answer += i
            }
        }
        a == b -> {
            answer = a.toLong()
        }

        a < b -> {

            for(i in a .. b) {
                answer += i
            }
        }
    }
    println(answer)
    return answer
}