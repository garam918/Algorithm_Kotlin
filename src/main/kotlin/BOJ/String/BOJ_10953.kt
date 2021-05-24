package BOJ.String

fun main() = repeat(readLine()!!.toInt()) {
        val tc = readLine()!!.split(",")
        println(tc[0].toInt()+tc[1].toInt())
}
