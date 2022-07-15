package BOJ.DataStructure

fun main() {

    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").toSet()

    val m = readLine()!!.toInt()

    readLine()!!.split(" ").forEach {
        if (list.contains(it)) println(1)
        else println(0)
    }
}