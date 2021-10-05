package BOJ.Implementation

fun main() {
    val fir = readLine()!!.split(" ")
    val sec = readLine()!!.split(" ")

    val a = fir[0].toInt() + sec[1].toInt()
    val b = fir[1].toInt() + sec[0].toInt()

    if(a > b) println(b)
    else println(a)
}