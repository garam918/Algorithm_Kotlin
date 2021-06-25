package BOJ.Greedy

fun main() = repeat(readLine()!!.toInt()) {
    readLine()!!.toInt()
    val al = readLine()!!.toString().split(" ")
    var answer = ""

    al.forEachIndexed { index, s ->
        when {
            answer.isEmpty() -> answer += s
            s <= answer.first().toString() -> answer = s + answer
            else -> answer += s
        }
    }
    println(answer)
}
