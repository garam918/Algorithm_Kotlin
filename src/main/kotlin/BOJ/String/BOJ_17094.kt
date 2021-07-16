package BOJ.String

fun main() {
    val l = readLine()!!.toInt()
    val s = readLine()!!.toString()
    var twoCount = 0
    var eCount = 0

    s.forEachIndexed { index, c ->
        when(c) {
            '2' -> {
                twoCount++
            }
            'e' -> {
                eCount++
            }
        }
    }

    when{
        twoCount > eCount -> {
            println("2")
        }
        twoCount < eCount -> {
            println("e")
        }
        twoCount == eCount -> {
            println("yee")
        }
    }
}