package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString()

    if(s.toLowerCase() == s.toLowerCase().reversed()) println("Yes")
    else println("No")
}