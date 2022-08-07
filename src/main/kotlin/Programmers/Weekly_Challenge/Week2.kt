package Programmers.Weekly_Challenge

fun main() {
    println(solution(arrayOf(intArrayOf(70,49,90), intArrayOf(68,50,38), intArrayOf(73,31,100))))
}

private fun solution(scores: Array<IntArray>): String {
    var answer = ""


    for (i in scores.indices) {
        var count = 0
        val list = MutableList(scores[i].size) { 0 }

        repeat(scores[i].size) {
            list[it] = scores[it][i]
        }

        answer += if(list.minOrNull() == scores[i][i] || list.maxOrNull() == scores[i][i]) {
            list.sorted().forEachIndexed { index, int ->
                if (scores[i][i] == int) count++
            }
            if (count >= 2) avgToGrade(list.average().toInt())
            else {
                list.remove(scores[i][i])
                avgToGrade(list.average().toInt())
            }
        }
        else avgToGrade(list.average().toInt())

    }

    return answer
}

private fun avgToGrade(score : Int) : String {
    return when(score) {
        in 90 .. 100 -> "A"
        in 80 until 90 -> "B"
        in 70 until 80 -> "C"
        in 50 until 70 -> "D"
        else -> "F"
    }
}
