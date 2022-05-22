package BOJ.Hash

fun main() {

    val map = mutableMapOf<String,Int>()

    repeat(readLine()!!.toInt()) {
        val extension = readLine()!!.split(".")[1]

        if(map.containsKey(extension)) map[extension] = map[extension]!! + 1
        else map[extension] = 1
    }

    map.toList().sortedBy { it.first }.toMap().forEach {
        println("${it.key} ${it.value}")
    }
}