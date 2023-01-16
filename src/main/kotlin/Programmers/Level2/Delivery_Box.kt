package Programmers.Level2

fun main() = println(solution(intArrayOf(1,3,2,4,5)))

private fun solution(order: IntArray): Int {
    var answer = 0

    val belt = mutableListOf<Int>()
    var j = 0

    for(i in 1 .. order.size) {

        if(i != order[j]) {
            belt.add(i)
            continue
        }

        answer++
        j++

        while(true) {
            if(belt.isEmpty() || belt.last() != order[j]) break
            else {
                answer++
                belt.removeLast()
                j++
            }
        }
    }

    return answer
}