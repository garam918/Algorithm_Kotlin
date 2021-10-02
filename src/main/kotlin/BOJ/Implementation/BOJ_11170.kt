package BOJ.Implementation

fun main() = repeat(readLine()!!.toInt()) {
    var count = 0
    val s = readLine()!!.toString().split(" ")

    for(i in s[0].toInt() .. s[1].toInt()) i.toString().forEach { if(it == '0') count++ }

    println(count)
}