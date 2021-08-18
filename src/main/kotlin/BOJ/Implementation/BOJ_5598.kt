package BOJ.Implementation

fun main() {
    readLine()!!.toString().forEachIndexed { index, c ->
        when {
            c.toInt() in 65 .. 67 -> print((c.toInt() + 23).toChar())
            c.toInt() == 32 -> print(c)
            else -> print((c.toInt() - 3).toChar())
        }
    }
}