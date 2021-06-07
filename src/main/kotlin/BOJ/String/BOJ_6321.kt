package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    val s = readLine()!!.toString()
    println("String #${it+1}")
    s.forEachIndexed { index, c ->
        if(c == 'Z') print('A')
        else print(c+1)
    }
    println()
    println()
}
