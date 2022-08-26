package BOJ.DataStructure

fun main() = repeat(readln().toInt()) {
    val list = mutableListOf<Priority>()
    val stack = ArrayDeque<Priority>()

    val (n,m) = readln().split(" ").map { it.toInt() }
    readln().split(" ").forEachIndexed { index, s ->
        list.add(Priority(index,s.toInt()))
    }

    while (list.isNotEmpty()) {
        if(!list.subList(1,list.size).filter { it.priority > list.first().priority }.isNullOrEmpty()) {
            list.add(list.first())
            list.removeFirst()
        }
        else {
            stack.add(list.first())
            list.removeFirst()
        }
    }

    println(stack.indexOf(stack.find { it.index == m }) + 1)
}

private data class Priority(
    var index: Int,
    var priority: Int
)