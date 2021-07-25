package BOJ.Implementation

fun main() {
    var answer = 0
    readLine()!!.toString().split(" ").onEachIndexed { index, s ->
        answer += (s.toInt() * s.toInt())
    }
    println(answer % 10)
}