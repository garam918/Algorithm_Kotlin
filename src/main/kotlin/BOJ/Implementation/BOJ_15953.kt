package BOJ.Implementation

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString().split(" ")

    val first = s[0].toInt()
    val second = s[1].toInt()

    var answer = 0

    answer += when(first) {
        0 -> 0
        1 -> 500
        in 2 .. 3 -> 300
        in 4 .. 6 -> 200
        in 7 .. 10 -> 50
        in 11 .. 15 -> 30
        in 16 .. 21 -> 10
        else -> 0
    }

    answer += when (second) {
        0 -> 0
        1 -> 512
        in 2..3 -> 256
        in 4..7 -> 128
        in 8..15 -> 64
        in 16 .. 31 -> 32
        else -> 0
    }
    println(answer*10000)
}