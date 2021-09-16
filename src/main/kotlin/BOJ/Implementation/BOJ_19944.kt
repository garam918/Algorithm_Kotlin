package BOJ.Implementation

fun main() {
    val nm = readLine()!!.toString().split(" ")

    when (nm[1].toInt()) {
        in 1 .. 2 -> println("NEWBIE!")
        in 3 .. nm[0].toInt() -> println("OLDBIE!")
        else -> println("TLE!")
    }
}