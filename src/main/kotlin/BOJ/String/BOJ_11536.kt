package BOJ.String

fun main() {
    val list = mutableListOf<String>()

    repeat(readln().toInt()) { list.add(readln()) }

    val answer = when (list) {
        list.sortedDescending() -> "DECREASING"
        list.sorted() -> "INCREASING"
        else -> "NEITHER"
    }
    println(answer)
}