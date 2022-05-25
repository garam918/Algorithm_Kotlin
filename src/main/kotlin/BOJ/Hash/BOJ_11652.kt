package BOJ.Hash

fun main() {

    val map = mutableMapOf<Long,Int>()

    repeat(readLine()!!.toInt()) {
        val number = readLine()!!.toLong()
        if(map.containsKey(number)) map[number] = map[number]!! + 1
        else map[number] = 1
    }

    println(map.toList().sortedWith(compareBy ( {it.second},{it.first} )).maxWithOrNull(compareBy { it.second })?.first)
}