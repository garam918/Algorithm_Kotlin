package BOJ.Implementation

fun main() {

    val list = mutableListOf<Int>()

    repeat(5) {
        var score = 0
        readLine()!!.split(" ").forEach { score += it.toInt() }
        list.add(score)
    }
    println("${list.indexOf(list.maxOf { it })+1} ${list.maxOf { it }}")
}