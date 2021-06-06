package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    readLine()!!.toString().split(" ").forEachIndexed { index, s ->
        if(index == 0) print("god")
        else print(s)
    }
    println()
}
