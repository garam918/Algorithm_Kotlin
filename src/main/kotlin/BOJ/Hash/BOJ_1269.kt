package BOJ.Hash

fun main() {

    val ab = readLine()!!.split(" ")
    val a = readLine()!!.split(" ").toSet()
    val b = readLine()!!.split(" ").toSet()

    println((b-a).size + (a-b).size)

}