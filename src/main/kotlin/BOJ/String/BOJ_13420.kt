package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString().split(" ")
    val a = s[0].toLong()
    val b = s[2].toLong()
    val ans = s[4].toLong()
    when(s[1]) {
        "+" -> {
            if(a + b == ans) println("correct")
            else println("wrong answer")
        }
        "-" -> {
            if(a - b == ans) println("correct")
            else println("wrong answer")
        }
        "*" -> {
            if(a * b == ans) println("correct")
            else println("wrong answer")
        }
        "/" -> {
            if(a / b == ans) println("correct")
            else println("wrong answer")
        }
    }
}
