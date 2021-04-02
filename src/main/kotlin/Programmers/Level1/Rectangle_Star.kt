package Programmers.Level1

fun main() {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for(i in 0 until b) {
        for (j in 0 until a) {
            print("*")
        }
        println()
    }

    println(a + b)
}