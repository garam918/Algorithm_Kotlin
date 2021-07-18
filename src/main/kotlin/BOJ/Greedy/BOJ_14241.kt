package BOJ.Greedy

fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!.toString().split(" ")

    var answer = 0
    var currentSize = s[0].toInt()

    repeat(n-1) {
        answer += (currentSize * s[it+1].toInt())
        currentSize += s[it + 1].toInt()
    }

    println(answer)

}