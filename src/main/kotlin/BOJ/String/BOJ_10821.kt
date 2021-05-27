package BOJ.String

fun main() {
    val s = readLine()!!.toString().split(",")
    var count = 0

    s.forEachIndexed { index, str ->
        if(!str.contains('.')) count++
    }
    println(count)
}