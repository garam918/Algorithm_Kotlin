package BOJ.Greedy

fun main() {

    val s = readLine()!!.toInt()

    var n = 1000 - s

    var result = 0

    result += n / 500

    n %= 500

    result += n / 100

    n %= 100

    result += n / 50

    n %= 50

    result += n / 10

    n %= 10

    result += n / 5

    n %= 5

    result += n / 1

    println(result)
}