package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
    var gCount = 0
    var bCount = 0

    val s = readLine()!!.toString()
    s.toLowerCase().onEachIndexed { index, c ->
        when(c) {
            'g' -> gCount++
            'b' -> bCount++
        }
    }
    when {
        gCount > bCount -> println("$s is GOOD")
        gCount < bCount -> println("$s is A BADDY")
        else -> println("$s is NEUTRAL")
    }
}