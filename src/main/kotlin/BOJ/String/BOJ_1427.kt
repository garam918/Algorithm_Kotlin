package BOJ.String

fun main() = readLine()!!.split(""," ").toString().filterIndexed { index, c ->
        c.isDigit()
    }.toCharArray().sortedByDescending { it }.forEachIndexed { index, c ->
    print(c)
    }
