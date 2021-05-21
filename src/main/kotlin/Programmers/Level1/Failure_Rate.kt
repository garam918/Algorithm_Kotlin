package Programmers.Level1

fun main() {
    println(solution(5, intArrayOf(1,2,2,1,3)).toList())
}

private fun solution(N: Int, stages: IntArray): IntArray {
    var answer = intArrayOf()

    stages.sort()

    var stageSize = stages.size

    val hash = HashMap<Int,Double>()

    for(j in 1 .. N) {
        var count = 0
        for(element in stages.sortedArray()) {

            when (element) {
                j -> {
                    count++
                }
            }
        }
        if(count == 0) hash[j] = 0.0
        else hash[j] = (count.toDouble() / stageSize.toDouble())
        stageSize -= count

    }

    hash.entries.sortedByDescending {
        it.value
    }.mapIndexed { index, mutableEntry ->
        answer += intArrayOf(mutableEntry.key)
    }

    return answer
}
