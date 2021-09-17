package BOJ.Implementation

fun main() {
    val t = readLine()!!.toString().split(" ")[1].toInt()

    var time = 0
    var count = 0

    readLine()!!.toString().split(" ").forEach {
        time += it.toInt()
        if(time <= t) count++
    }

    println(count)
}