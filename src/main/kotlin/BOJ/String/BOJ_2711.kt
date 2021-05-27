package BOJ.String

fun main() =
    repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toString().split(" ")
        val loc = s[0].toInt()
        val word = s[1]

        print(word.filterIndexed { index, c ->
            loc-1 != index
        })
        println()
    }
