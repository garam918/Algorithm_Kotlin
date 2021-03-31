package Programmers

fun main() {
    solution(10)
}

private fun solution(x: Int): Boolean {
    var answer = true

    var temp = 0

    if(x in 1 .. 10000) {
        repeat(x.toString().length) {
            temp += x.toString().slice(IntRange(it,it)).toInt()
        }
        answer = when {
            x % temp == 0 -> {
                true
            }
            else -> {
                false
            }
        }
    }

    return answer
}