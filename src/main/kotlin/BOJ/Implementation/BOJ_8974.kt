package BOJ.Implementation

fun main() {
    val ab = readLine()!!.split(" ")
    val a = ab[0].toInt()
    val b = ab[1].toInt()

    val list = mutableListOf<Int>()

    repeat(46) {
        repeat(it) { i->
            list.add(it)
        }
    }
    println(list.subList(a-1,b).sum())
}