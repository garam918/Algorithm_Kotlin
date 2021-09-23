package BOJ.Implementation

fun main() = repeat(readLine()!!.toInt()) {

    val s = readLine()!!.toString().split(" ")

    val a = s[0]
    val b = s[1]

    var d = 1

    if(a.length != b.length) d = 0
    else a.toCharArray().sortedArray().forEachIndexed { index, c -> if(c != b.toCharArray().sortedArray()[index]) d = 0 }

    if(d == 1) println("$a & $b are anagrams.")
    else println("$a & $b are NOT anagrams.")
}