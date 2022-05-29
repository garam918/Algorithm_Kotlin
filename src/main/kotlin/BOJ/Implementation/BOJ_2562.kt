package BOJ.Implementation

fun main() {

    val list = arrayListOf<Int>()

    repeat(9) {
        list.add(readLine()!!.toInt())
    }

    println(list.maxOrNull())
    println(list.indexOf(list.maxOrNull()!!)+1)
}