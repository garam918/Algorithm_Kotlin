package Programmers.Level2

fun main() = println(solution(intArrayOf(7,9,1,1,4)))

private fun solution(elements: IntArray): Int {
    val answer: Int
    val set = mutableSetOf<Int>()

    for(i in elements.indices) {
        when (i) {
            0 -> elements.forEach { set.add(it) }
            elements.size-1 -> set.add(elements.sum())
            else -> {
                for(j in elements.indices) {
                    if((i + 1 + j) < elements.size) set.add(elements.slice(IntRange(j,i+j)).sum())
                    else {
                        val tempArr = elements + elements
                        set.add(tempArr.slice(IntRange(j,i+j)).sum())
                    }
                }
            }
        }
    }
    answer = set.size

    return answer
}