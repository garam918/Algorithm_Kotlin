package BOJ.Hash

fun main() {

    val map = mutableMapOf<String,Int>()

    repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toList().sortedBy { it }.joinToString { it.toString() }
        if(map.containsKey(s)) map[s] = map[s]!! + 1
        else map[s] = 1
    }

    println(map.size)

}