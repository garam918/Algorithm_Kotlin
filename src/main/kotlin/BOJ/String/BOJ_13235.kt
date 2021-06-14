package BOJ.String

fun main() {
    val word = readLine()!!.toString()
    if(word == word.reversed()) println(true)
    else println(false)
}