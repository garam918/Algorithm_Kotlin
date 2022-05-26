package BOJ.Implementation

fun main() {
    val list = arrayListOf<Int>()

    repeat(4) {
        val n = readLine()!!.split(" ")

        if(list.isEmpty()) list.add(n[1].toInt())
        else list.add(list.last() - n[0].toInt() + n[1].toInt())
    }

    println(list.maxOrNull())
}