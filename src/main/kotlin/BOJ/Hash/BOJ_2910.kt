package BOJ.Hash

fun main() {

    val nc = readLine()!!.split(" ")
    val n = nc[0].toInt()
    val c = nc[1].toInt()

    val map = mutableMapOf<Int,Int>()

    readLine()!!.split(" ").forEach {
        val m = it.toInt()

        if(map.containsKey(m)) map[m] = map[m]!! + 1
        else map[m] = 1
    }

    map.toList().sortedByDescending { it.second }.toMap().forEach {
        repeat(it.value) { i->
            print("${it.key} ")
        }
    }

}