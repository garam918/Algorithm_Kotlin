package BOJ.String

fun main() {
    readLine()!!.toInt()
    val name = readLine()!!.toString()
    var answer = 0

    name.forEachIndexed { index, c ->
        answer += c.toInt() -64
    }
    println(answer)
}