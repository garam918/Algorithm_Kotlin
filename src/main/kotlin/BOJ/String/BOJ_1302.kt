package BOJ.String

fun main() {
    val map = mutableMapOf<String,Int>()

    repeat(readLine()!!.toInt()) {
        val name = readLine()!!.toString()

        if(map.containsKey(name)) map[name] = map[name]!! + 1
        else map[name] = 1
    }

    println(map.filter { it.value == map.maxOf { it.value } }.toList().sortedBy { it.first }.first().first)

}