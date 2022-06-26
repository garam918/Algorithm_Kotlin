package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    var count = 0
    var answer = 0
    readLine()!!.forEach { c ->
        if (c == 'O') count++
        else count = 0
        answer += count
    }
    println(answer)
}