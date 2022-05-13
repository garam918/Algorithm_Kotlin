package BOJ.Implementation

fun main() {
    val list = mutableListOf<Int>()
    val answer = mutableListOf<Int>()

    repeat(28) {
        list.add(readLine()!!.toInt())
    }

    repeat(30) {
        if(!list.contains(it+1)) answer.add(it+1)
    }

    answer.sorted().forEach {
        println(it)
    }
}