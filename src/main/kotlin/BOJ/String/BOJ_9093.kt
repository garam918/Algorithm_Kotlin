package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toString().split(" ")
        repeat(s.size) {
            print(s[it].reversed() + " ")
        }
    }
