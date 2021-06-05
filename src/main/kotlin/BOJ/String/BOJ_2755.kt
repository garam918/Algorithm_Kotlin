package BOJ.String

import kotlin.math.round

fun main() {
    var answer = 0.0
    var wholeCredit = 0

    repeat(readLine()!!.toInt()) {
        val s = readLine()!!.toString().split(" ")
        val credit = s[1].toInt()
        wholeCredit += credit
        val grade = s[2]

        when(grade) {
            "A+" -> {
                answer += (4.3 * credit)
            }
            "A0" -> {
                answer += (4.0 * credit)
            }
            "A-" -> {
                answer += (3.7 * credit)
            }
            "B+" -> {
                answer += (3.3 * credit)
            }
            "B0" -> {
                answer += (3.0 * credit)
            }
            "B-" -> {
                answer += (2.7 * credit)
            }
            "C+" -> {
                answer += (2.3 * credit)
            }
            "C0" -> {
                answer += (2.0 * credit)
            }
            "C-" -> {
                answer += (1.7 * credit)
            }
            "D+" -> {
                answer += (1.3 * credit)
            }
            "D0" -> {
                answer += (1.0 * credit)
            }
            "D-" -> {
                answer += (0.7 * credit)
            }
            "F" -> {
                answer += (0.0 * credit)
            }
        }
    }
    val temp = round(((answer / wholeCredit) * 100)) / 100
    println(String.format("%.2f",temp))
}