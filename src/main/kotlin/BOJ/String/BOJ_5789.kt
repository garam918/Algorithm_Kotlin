package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString()
    if(s[(s.length/2)-1] == s[(s.length/2)]) println("Do-it")
    else println("Do-it-Not")
}
