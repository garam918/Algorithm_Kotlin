package BOJ.DataStructure

fun main() {
    val deque = ArrayDeque<Int>()

    repeat(readln().toInt()) {
        deque.add(it+1)
    }

    while(deque.size != 1) {
        deque.removeFirst()
        deque.addLast(deque.first())
        deque.removeFirst()
    }

    println(deque.first())
}