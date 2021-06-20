package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString().split(" ")
    s.forEachIndexed { index, c ->
        if(index != 0 && index != 1) print("$c ")
    }
    println("${s[0]} ${s[1]}")
}
