package BOJ.String

fun main() {
    readLine()!!.toString().forEachIndexed { index, c ->
        var temp = 0
        c.toInt().toString().forEachIndexed { index, ch ->
            temp += ch.toString().toInt()
        }
        repeat(temp) {
            print(c)
        }
        println()
    }
}