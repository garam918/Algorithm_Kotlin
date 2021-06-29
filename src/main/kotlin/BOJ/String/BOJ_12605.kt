package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString().split(" ")
    print("Case #${it+1}: ")
    s.reversed().forEachIndexed { index, str ->
        if(index != s.size-1) print("$str ")
        else print(str)
    }
    println()
}