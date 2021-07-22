package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {

    var score = 0
    readLine()!!.toString().onEachIndexed { index, c ->
        if(c != ' ') {
            score += (c.toInt() - 64)
        }
    }

    if(score != 100) println(score)
    else println("PERFECT LIFE")
}