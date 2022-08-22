package BOJ.DataStructure

fun main() {

    val n = readln().toInt()
    val deque = ArrayDeque<Int>()

    repeat(n) {
        val op = readln()
        var num = 0
        var ioOp = ""
        if(op.contains("push")) {
            ioOp = op.split(" ")[0]
            num = op.split(" ")[1].toInt()
        }
        when {
            op == "size" -> println(deque.size)
            op == "empty" -> {
                if(deque.isEmpty()) println(1)
                else println(0)
            }
            op == "front" -> {
                if(deque.isNotEmpty()) println(deque.first())
                else println(-1)
            }
            op == "back" -> {
                if(deque.isNotEmpty()) println(deque.last())
                else println(-1)
            }
            op == "pop_front" -> {
                if (deque.isEmpty()) println(-1)
                else {
                    println(deque.first())
                    deque.removeFirst()
                }
            }
            op == "pop_back" -> {
                if (deque.isEmpty()) println(-1)
                else {
                    println(deque.last())
                    deque.removeLast()
                }
            }
            ioOp == "push_front" -> deque.addFirst(num)
            ioOp == "push_back" -> deque.addLast(num)

        }
    }
}