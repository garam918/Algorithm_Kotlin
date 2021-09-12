package BOJ.Implementation

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString()
    val t = s.toInt() + s.reversed().toInt()
    if( t.toString() == t.toString().reversed()) println("YES")
    else println("NO")
}