package Programmers.Level2

fun main() {
    println(solution(intArrayOf(1,1,9,1,1,1),0))
}

private fun solution(priorities: IntArray, location: Int): Int {

    val list = mutableListOf<Priority>()
    val stack = ArrayDeque<Priority>()

    priorities.forEachIndexed { index, i ->
         list.add(Priority(index,i))
    }

    while(list.isNotEmpty()) {
        if (!list.subList(1, list.size).filter { it.priority > list.first().priority }.isNullOrEmpty()) {
            list.add(list.first())
            list.removeFirst()
        } else {
            stack.add(list.first())
            list.removeFirst()
        }
    }

    return stack.indexOf(stack.find { it.index == location }!!) + 1
}

private data class Priority(
        var index : Int,
        var priority : Int
)