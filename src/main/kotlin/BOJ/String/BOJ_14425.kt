package BOJ.String

import kotlin.collections.HashMap

fun main() {
    val nm = readLine()!!.toString().split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()

    val s = HashMap<String,Boolean> (n)
    val check = List(m) { "" }.toMutableList()
    repeat(n) {
        s[readLine()!!.toString()] = true
    }

    repeat(m) {
        check[it] = readLine()!!.toString()
    }

    var answer = 0

    check.forEachIndexed { index, str ->
        if(s.containsKey(str)) answer++
    }

    println(answer)
}