package BOJ.String

fun main() {
    val ring = readLine()!!
    var count = 0
    repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toString()
        val temp = s.repeat(2)
        if(temp.contains(ring)) count++

    }
    println(count)
}