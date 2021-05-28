package BOJ.String

fun main() {
    var answer = 0
    readLine()!!.toString().split(",").onEachIndexed { index, s ->
        answer += s.toInt()
    }
    println(answer)
}