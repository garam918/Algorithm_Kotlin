package BOJ.BruteForce

import kotlin.math.max

fun main() {
    val s = readLine()!!.split(" ")

    val n = s[0].toInt()
    val m = s[1].toInt()

    var answer = 0

    val num = readLine()!!.split(" ")

    for(i in 0 until n) {
        for(j in i+1 until n) {
            for(k in j+1 until n) {
                val test = num[i].toInt() + num[j].toInt() + num[k].toInt()
                if(test <= m) {
                    answer = max(answer, test)
                }
            }
        }
    }

    println(answer)

}
