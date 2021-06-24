package BOJ.Greedy

fun main() {
    val s = readLine()!!.toString().split(" ")
    var l = s[1].toInt()

    readLine()!!.toString().split(" ")
            .sortedBy { it.toInt() }
            .forEachIndexed { index, str ->
        if(l >= str.toInt()) l++
    }
    println(l)
}