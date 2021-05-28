package BOJ.String

fun main() {
    val s = readLine()!!.toString()
    var left = 0
    var right = 0
    s.filterIndexed { index, c ->
        index < (s.length / 2)
    }.onEachIndexed { index, c ->
        left += c.toString().toInt() }

    s.filterIndexed { index, c ->
        index >= (s.length / 2)
    }.onEachIndexed { index, c ->
        right += c.toString().toInt() }

    if(left == right) println("LUCKY")
    else println("READY")
}