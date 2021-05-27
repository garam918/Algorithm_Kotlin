package BOJ.String

fun main() {
    val word = readLine()!!.toString()
    if(word == word.reversed()) println(1)
    else println(0)
}