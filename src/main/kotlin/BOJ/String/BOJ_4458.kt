package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    readLine()!!.toString().forEachIndexed { index, c ->
        print(if(index == 0) c.toUpperCase() else c)
    }
    println()
}
