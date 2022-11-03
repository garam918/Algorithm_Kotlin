package Programmers.Level2

fun main() = println(solution(intArrayOf(1,7,1,2)))

private fun solution(food: IntArray): String {
    var answer = ""

    food.forEachIndexed { index, i -> if(index != 0) for(i in 1 .. i / 2) answer += index }

    var temp = answer.reversed()
    answer = answer + "0" + temp

    return answer
}