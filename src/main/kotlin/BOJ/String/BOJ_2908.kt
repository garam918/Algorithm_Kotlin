package BOJ.String

fun main() {

    val s = readLine()!!
    val a = s.split(" ")[0].reversed().toInt()
    val b = s.split(" ")[1].reversed().toInt()

    if( a > b) println(a)
    else println(b)

}