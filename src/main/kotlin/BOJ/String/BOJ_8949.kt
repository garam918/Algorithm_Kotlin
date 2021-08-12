package BOJ.String

import kotlin.math.absoluteValue

fun main() {
    val s = readLine()!!.toString().split(" ")
    val a = s[0]
    val b = s[1]

    var answer = ""

    val len = a.length - b.length

    when {
        len > 0 -> {
            repeat(len.absoluteValue) {
                answer += a[it]
            }
            repeat(b.length) {
                answer += a[len.absoluteValue + it].toString().toInt() + b[it].toString().toInt()
            }
        }
        len < 0 -> {
            repeat(len.absoluteValue) {
                answer += b[it]
            }
            repeat(a.length) {
                answer += b[len.absoluteValue + it].toString().toInt() + a[it].toString().toInt()
            }
        }
        len == 0 -> {
            repeat(a.length) {
                answer += a[it].toString().toInt() + b[it].toString().toInt()
            }
        }
    }

    println(answer)
}