package BOJ.String

fun main() {
    val c = readLine()!!
    println(ascii(c[0]))
}

private fun ascii(c: Char) : Int {
    return c.toInt()
}