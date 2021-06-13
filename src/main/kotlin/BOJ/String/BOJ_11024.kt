package BOJ.String

fun main() {
    repeat(readLine()!!.toInt()) {
        var answer = 0
        readLine()!!.toString().split(" ").forEachIndexed { index, s ->
            answer += s.toInt()
        }
        println(answer)

    }
}