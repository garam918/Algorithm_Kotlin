package BOJ.String

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val s = br.readLine()
    var answer = ""
    val h = mutableMapOf<Char,Int>()
    var max = 0

    repeat(s.length) {
        if(h.containsKey(s[it].toUpperCase())) {
           h[s[it].toUpperCase()] = h[s[it].toUpperCase()]!!.plus(1)
        } else h[s[it].toUpperCase()] = 1
    }

    h.onEachIndexed { index, entry ->
        if(entry.value > max) {
            max = entry.value
            answer = entry.key.toString()
        } else if (entry.value == max) answer = "?"
    }

    println(answer)
}