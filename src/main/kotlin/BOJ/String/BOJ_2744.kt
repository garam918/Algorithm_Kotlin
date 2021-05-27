package BOJ.String

fun main() {
    val word = readLine()!!.toString()
    word.onEachIndexed { index, c ->
        if(c.isLowerCase()) print(c.toUpperCase())
        else print(c.toLowerCase())
    }
}