package BOJ.Implementation

fun main() {

    val list = mutableListOf<Int>()

    repeat(7) {
        val num = readLine()!!.toInt()
        if(num % 2 == 1) list.add(num)
    }

    if(list.isEmpty()) println(-1)
    else {
        println(list.sum())
        println(list.minOrNull())
    }
}