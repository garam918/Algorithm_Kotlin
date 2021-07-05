package BOJ.String

fun main() {
    val a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    repeat(readLine()!!.toInt()) {
        var answer = 0
        val s = readLine()!!.toString()
        a.forEachIndexed { index, c ->
            if(!s.contains(c)) answer += c.toInt()
        }
        println(answer)
    }
}